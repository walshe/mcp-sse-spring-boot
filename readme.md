
### Demonstrates MCP SSE with spring boot.


Run with

    ./gradlew clean bootRun      

Configure Cursor client's mcp.json (for example):

```json
{
  "mcpServers": {
    "springboot-sse-mcp-server": {
        "url": "http://localhost:8080/sse"
    }
  }
}
```


Good video on how sse works and the underlying messages sent to /mcp : https://www.youtube.com/watch?v=n5DG0uClbdo


