/*
 * Copyright 2018 casa.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cat.indiketa.degiro.engine.event;

import cat.indiketa.degiro.model.DPortfolioProducts;

/**
 *
 * @author indiketa
 */
public class DProductChanged {

    private final DPortfolioProducts.DPortfolioProduct product;
    private final long productId;

    public DProductChanged(DPortfolioProducts.DPortfolioProduct product, long productId) {
        this.product = product;
        this.productId = productId;
    }

    public DPortfolioProducts.DPortfolioProduct getProduct() {
        return product;
    }

    public long getProductId() {
        return productId;
    }
    
    

}