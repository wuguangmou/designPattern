package com.designPattern.structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalog extends CatalogComponent{
    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();
    private String name;
    private Integer level;

    public CourseCatalog(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent item : items){
            if (this.level != null){
                for (int i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
            }
            item.print();
        }
    }
}
