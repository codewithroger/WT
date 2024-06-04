<?php
// Check if the form is submitted and the file is uploaded
if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_FILES["file"])) {
    $targetDir = "uploads/"; 
    $targetFile = $targetDir . basename($_FILES["file"]["name"]); // Get the file name

   
    if (file_exists($targetFile)) {
        echo "File already exists.";
    } else {
        
        if (move_uploaded_file($_FILES["file"]["tmp_name"], $targetFile)) {
            echo "The file " . basename($_FILES["file"]["name"]) . " has been uploaded.";
        } else {
            echo "Error uploading file.";
        }
    }
} else {
    echo "File upload failed.";
}
?>
