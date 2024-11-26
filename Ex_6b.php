<?php
$xmlFile = "devices.xml";

// Load the XML file
if (file_exists($xmlFile)) {
    $xml = simplexml_load_file($xmlFile);
} else {
    die("Failed to load XML file.");
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>XML Parsing</title>
</head>
<body>
    <h1>Hardware Devices from XML</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Type</th>
            <th>Description</th>
        </tr>
        <?php
        foreach ($xml->device as $device) {
            echo "<tr>
                    <td>" . $device->id . "</td>
                    <td>" . $device->name . "</td>
                    <td>" . $device->type . "</td>
                    <td>" . $device->description . "</td>
                </tr>";
        }
        ?>
    </table>
</body>
</html>
