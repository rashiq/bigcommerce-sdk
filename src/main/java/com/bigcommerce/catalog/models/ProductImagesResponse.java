package com.bigcommerce.catalog.models;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

@XmlRootElement
public class ProductImagesResponse {
    private List<ProductImage> data = new LinkedList<>();
    private Meta meta = new Meta();

    public List<ProductImage> getData() {
        return data;
    }

    public void setData(final List<ProductImage> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(final Meta meta) {
        this.meta = meta;
    }
}
