# 5_1 Nextcloud Hardening
## Nextcloud Security and Hardening Guide
[Nextcloud Security and Hardening Guide](https://docs.nextcloud.com/server/latest/admin_manual/installation/harden_server.html)

| Measure                                                    |
| ---------------------------------------------------------- |
| Give PHP read access to /dev/urandom                       |
| Enable hardening modules such as SELinux                   |
| Place data directory outside of the web root               |
| Disable preview image generation                           |
| Disable Debug Mode                                         |
| Use HTTPS                                                  |
| Redirect all unencrypted traffic to HTTPS                  |
| Enable HTTP Strict Transport Security                      |
| Proper SSL configuration                                   |
| Restrict admin actions to a specific range of IP addresses |
| Use a dedicated domain for Nextcloud                       |
| Ensure that your Nextcloud instance is installed in a DMZ  |
| Serve security related headers by the Web server           |
| Connections to remote servers                              |
| Setup fail2ban                                             |

## Nextcloud Security Scan
[Nextcloud Security Scan](https://scan.nextcloud.com/)  
Check for known weaknesses and recommendation for better configs.