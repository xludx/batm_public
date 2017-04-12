package com.generalbytes.batm.server.extensions.extra.particl.wallets;

import com.generalbytes.batm.server.extensions.IPaperWallet;

/**
 *
 *
 * @author Juha Kovanen, Particl Project
 */
public class ParticlPaperWallet implements IPaperWallet {

    private String address;
    private String privateKey;
    private String message;
    private String fileExtension = "zip";
    private String contentType = "application/zip";
    private byte[] content;

    public ParticlPaperWallet() {
    }

    @Override
    public byte[] getContent() {
        return new byte[0];
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public String getPrivateKey() {
        return null;
    }

    @Override
    public String getFileExtension() {
        return null;
    }

    @Override
    public String getContentType() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
