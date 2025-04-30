package com.example.client.mcp;


import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.memory.InMemoryChatMemory;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * MCP服务器配置类，负责注册MCP工具
 */
@Configuration
public class McpClientConfig {
    @Bean
    ChatMemory chatMemory() {
        return new InMemoryChatMemory();
    }

}
