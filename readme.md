
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