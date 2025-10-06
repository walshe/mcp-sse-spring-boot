package com.walshe.mcp_server_sse_mvc_spring_boot;

import com.walshe.mcp_server_sse_mvc_spring_boot.service.BookService;
import io.modelcontextprotocol.server.McpServerFeatures;
import io.modelcontextprotocol.server.McpSyncServer;
import org.springframework.ai.mcp.McpToolUtils;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class McpServerSseMvcSpringBootApplication {

	//McpSyncServer mcpSyncServer ;

	public static void main(String[] args) {
		SpringApplication.run(McpServerSseMvcSpringBootApplication.class, args);
	}

//	@Bean
//	public ToolCallbackProvider bookTools() {
//		return MethodToolCallbackProvider.builder().toolObjects(new BookService()).build();
//	}


//    @Bean
//    CommandLineRunner commandLineRunner(
//        McpSyncServer mcpSyncServer
//    ) {
//        return args -> {
//            //if (authorToolsEnabled) {
//                ToolCallback[] toolCallbacks = ToolCallbacks.from(new BookService());
//                List<McpServerFeatures.SyncToolSpecification> tools = McpToolUtils.toSyncToolSpecifications(toolCallbacks);
//                tools.forEach(tool -> {
//                    mcpSyncServer.addTool(tool);
//                    mcpSyncServer.notifyToolsListChanged();
//                });
//            //}
//        };
//    }
}
