using System;
using System.Net.Http;
using System.Threading.Tasks;

class Program
{
    private static readonly HttpClient client = new HttpClient();

    static async Task Main()
    {
        string apiKey = "your_api_key_here"; // Replace with your actual NeuraNET API key
        string message = "Hello NeuraNET!";

        string url = $"https://neuranet-api.dark9015.repl.co/api/{apiKey}/{Uri.EscapeDataString(message)}";

        try
        {
            HttpResponseMessage response = await client.GetAsync(url);
            response.EnsureSuccessStatusCode();

            string responseBody = await response.Content.ReadAsStringAsync();
            Console.WriteLine(responseBody);
        }
        catch (HttpRequestException ex)
        {
            Console.WriteLine($"Error: {ex.Message}");
        }
    }
}
