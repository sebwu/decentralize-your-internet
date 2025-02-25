# Step 1 - Setup external Domain

## Register a Domain with a Registrar
E.g. inwx.de [inwx.de](https://www.inwx.de/en/domain/check#search=38c3.fun#region=DEFAULT#rc=rc1)

## Setup Dynamic DNS 
This is necessary, as for most Internet Service Providers, the public IP of your internet connection will change regularly and we want the domain purchased above to always redirect to your public IP adress.
To set this up, is is necessary to register with a DynDNS provider and to configure DynDNS in your Router.

### Register with DynDNS Provider
#### INWX
For INWX, log in, go to [My Account](https://www.inwx.de/en/customer), Name Server, [DynDNS](https://www.inwx.de/en/nameserver2/dyndns).
Click on 'Add Acount'.

Choose new credentials (use none of those created before):  
![INWX DynDNS creation](../images/inwx_dyndns.png)

### Configure DynDNS in your Router
Please see below example for a Fritzbox. If your router does not support DynDNS, it is also possible to have a script running regularly that updates the DynDNS provider upon IP Change. 
#### FritzBox
For FritzBox, log into your [FritzBox management UI](http://fritz.box) and go to 'Internet' -> 'Permit Access' -> ['DynDNS'](http://fritz.box/#/access/dyndns)

tick 'use DynDNS' and enter the following details:
- Update URL:
For INWX use
```python
https://<user>:<passwd>@dyndns.inwx.com/nic/update?myip=<ipaddr>
```
- Domain Name, User Name, Password:  
Use the data you created in step [Register with DynDNS Provider](#register-with-dyndns-provider)

![FritzBox DynDNS](../images/fritzbox-dyndns-configuration.png)

see also [official documentation](https://en.avm.de/service/knowledge-base/dok/FRITZ-Box-7581-int/30_Setting-up-dynamic-DNS-in-the-FRITZ-Box/)
