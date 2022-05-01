package com.vujo.spring5JokesAppV2;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.FactoryBean;

public class ChuckNorisQuotesFactory  implements FactoryBean<ChuckNorrisQuotes> {
    private ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    @Override
    public ChuckNorrisQuotes getObject() throws Exception {
        return chuckNorrisQuotes;
    }

    @Override
    public Class<?> getObjectType() {
        return ChuckNorrisQuotes.class;
    }
}
