BATM Public Repository
===========

This repository contains Bitcoin ATM related code used in BATMOne, BATMTwo and BATM Server products.

More information about the products can be found here: http://www.generalbytes.com


All source code is released under GPL2.

Overview
========
Here is the list of functionality that can be extended with extenstions API:
* **Implement support for different cryptocurrency wallets** - for more see <a href="https://github.com/GENERALBYTESCOM/batm_public/blob/master/server_extensions_api/src/main/java/com/generalbytes/batm/server/extensions/IWallet.java">IWallet</a> interface
* **Implement support for different cryptocurrency exchanges** - for more see <a href="https://github.com/GENERALBYTESCOM/batm_public/blob/master/server_extensions_api/src/main/java/com/generalbytes/batm/server/extensions/IExchange.java">IExchange</a> interface
* **Implement support for different cryptocurrency rate tickers** - for more see <a href="https://github.com/GENERALBYTESCOM/batm_public/blob/master/server_extensions_api/src/main/java/com/generalbytes/batm/server/extensions/IRateSource.java">IRateSource</a> interface
* **Implement support for different cryptocurrency payment processors** - for more see <a href="https://github.com/GENERALBYTESCOM/batm_public/blob/master/server_extensions_api/src/main/java/com/generalbytes/batm/server/extensions/IPaymentProcessor.java">IPaymentProcessor</a> interface



Content
=======
* **server_extensions_api** - contains extension api that all extensions use to extend BATM Server's functionality.
* **server_extensions_extra** - reference extension implementation that implements BTC, LTC, DASH, DOGE, NLG, ICG, NBT, GRS and MAX coin support functionality.
* **server_extensions_test** - contains tester for testing the extensions without requirement of having a BATM server

Build information
=================
```bash
cd server_extensions_api
ant
cd ..
cd server_extensions_extra
ant
cd ..
cp server_extensions_extra/dist/batm_server_extensions_extra.jar /batm/app/master/extensions/
```

Note for developers
==========
When you implement support for new crypto-coin add it please to **server_extensions_extra** this way it will get into default BATM Server installation pack for customers.

After you implement the the extension make sure you test it with Tester which you will find in **server_extensions_test**

How to run Tester
==========
```bash
cd server_extensions_test
ant
cd dist
./tester.sh -j ../../server_extensions_extra/dist/batm_server_extensions_extra.jar 
```

