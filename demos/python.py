import os
import requests

def send_request(api_key, message):
    # Define the URL of NeuraNET API
    url = f"https://neuranet-api.dark9015.repl.co/api/{api_key}/{message}"

    # Send the GET request to the API
    response = requests.get(url)

    # If the request was successful, print the response
    if response.status_code == 200:
        print(response.text)
    else:
        print(f"Error: {response.status_code}")

def main():
    # Get the API key from the environment variable
    api_key = os.getenv("NEURANET_API_KEY")
    if not api_key:
        print("In order to use NeuraNET, we kindly request that you set your actual NeuraNET API Key as an environment variable under the name 'NEURANET_API_KEY'.")
        return

    # Get the message from the user
    message = input("Send a message to NeuraNET: ")

    send_request(api_key, message)

if __name__ == "__main__":
    main()
