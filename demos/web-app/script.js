// NeuraNET API Call Demo (HTML, CSS & JS)
// This code is open source, feel free to use it as a starting point.

document.getElementById('api').addEventListener('submit', function(event) {
    event.preventDefault();

    const message = document.getElementById('message').value;
    const apiKey = 'your_api_key_here';  // Replace with your actual NeuraNET API key

    fetch(`https://neuranet-api.dark9015.repl.co/api/${apiKey}/${message}`)
        .then(response => response.text())
        .then(data => document.getElementById('response').innerHTML = data)
        .catch(error => console.error('Error:', error));
});
