package com.walshe.mcp_server_sse_mvc_spring_boot.config;

import com.walshe.mcp_server_sse_mvc_spring_boot.service.BookService;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<ToolCallback> toolCallbacks(BookService bookService) {
        return List.of(ToolCallbacks.from(
                bookService
        ));
    }
}
