package dev.vabalas.gvabaland.memes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemeRepo extends JpaRepository<Meme, Long> {
}
