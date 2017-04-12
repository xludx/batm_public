package com.generalbytes.batm.server.extensions.extra.particl;

//import org.bitcoinj.params.MainNetParams;

/**
 *
 * TODO: need bitcoinj
 *
 *  @author Juha Kovanen, Particl Project
 */
public class ParticlMainNetParams { //extends MainNetParams {

    private static ParticlMainNetParams instance;

    // TODO: these are for shadowcash, fix
    public ParticlMainNetParams() {
        /*
        this.id = "particl.main";
        this.addressHeader = 63;
        this.p2shHeader = 125;
        this.acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        this.spendableCoinbaseDepth = 500;
        this.dumpedPrivateKeyHeader = 191;
        */
    }

    public static synchronized ParticlMainNetParams get() {
        if(instance == null) {
            instance = new ParticlMainNetParams();
        }
        return instance;
    }
}