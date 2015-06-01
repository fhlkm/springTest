/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oreilly.justspring.ch2;

/**
 *
 * @author mkonda
 */
public class TradeReceiver {
    private TradePersistor tradePersistor = null;
    private TradeTransformer tradeTransformer = null;

    @Override
    public String toString() {
        return "TradeReceiver{" + "tradePersistor=" + tradePersistor + ", tradeTransformer=" + tradeTransformer + '}';
    }

	public TradePersistor getTradePersistor() {
		return tradePersistor;
	}

	public void setTradePersistor(TradePersistor tradePersistor) {
		this.tradePersistor = tradePersistor;
	}

	public TradeTransformer getTradeTransformer() {
		return tradeTransformer;
	}

	public void setTradeTransformer(TradeTransformer tradeTransformer) {
		this.tradeTransformer = tradeTransformer;
	}
    
    
}
