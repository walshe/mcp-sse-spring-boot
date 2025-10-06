package com.walshe.mcp_server_sse_mvc_spring_boot.model;

public record Book(
        Long id,
        String title,
        String author,
        String isbn,
        int publicationYear
) {
}
