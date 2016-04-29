<?php 

$html = file_get_contents('https://textnook.wordpress.com');
$dom = new DOMDocument;
$dom->loadHTML($html);
foreach ($dom->getElementsByTagName("header") as $node) {
    //echo "Full TD html: " . $dom->saveHtml($node) . "\n";
    echo "<br><br>";
    echo $node->nodeValue ;
}

?>



