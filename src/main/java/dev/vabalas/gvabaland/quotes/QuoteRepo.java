package dev.vabalas.gvabaland.quotes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepo extends JpaRepository<Quote, Long> {
}
