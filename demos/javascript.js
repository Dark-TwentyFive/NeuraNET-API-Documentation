const apiKey = 'your_api_key_here'; // Replace with your actual NeuraNET API key
const message = encodeURIComponent('Hello NeuraNET!');

fetch(`https://neuranet-api.dark9015.repl.co/api/${apiKey}/${message}`, {
    method: 'GET'
})
.then(response => response.text())
.then(data => console.log(data))
.catch((error) => {
    console.error('Error:', error);
});
