package dev.playground.interview.domain;

import jakarta.persistence.*;

@Entity
public class Plugin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "plugin_order")
    private int order;

    // Constructors
    public Plugin() {}
    public Plugin(String name, int order) {
        this.name = name;
        this.order = order;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getOrder() { return order; }
    public void setOrder(int order) { this.order = order; }
}
