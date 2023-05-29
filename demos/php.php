<?php

$api_key = 'your_api_key_here'; // Replace with your actual NeuraNET API key
$message = urlencode('Hello NeuraNET!');

$url = "https://neuranet-api.dark9015.repl.co/api/{$api_key}/{$message}";
$response = file_get_contents($url);

if ($response !== false) {
    echo $response;
} else {
    echo 'Error: Unable to fetch API response';
}
