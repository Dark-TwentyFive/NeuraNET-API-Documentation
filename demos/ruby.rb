require 'net/http'
require 'uri'

def send_request(api_key, message)
  uri = URI.parse("https://neuranet-api.dark9015.repl.co/api/#{api_key}/#{URI::DEFAULT_PARSER.escape(message)}")
  
  response = Net::HTTP.get_response(uri)

  if response.code.to_i == 200
    puts response.body
  else
    puts "Error: #{response.code}"
  end
end

api_key = 'your_api_key_here' # Replace with your actual NeuraNET API key
message = 'Hello NeuraNET!'
send_request(api_key, message)
