
## RStudio v1.2 Patch 2 "Elderflower"

### Misc

* Fully reset Connections pane objects when refreshing (#2136)	
* Fix incorrect `memory.limit()` result with R >= 3.6.0 (#4986)
* Unset `DYLD_INSERT_LIBRARIES` after launch on macOS to prevent spurious library load errors (#5313)
* Include R/RStudio version in HTTP user agent header when installing required packages (#5369)
* Eliminate warnings when using `_R_CHECK_LENGTH_1_LOGIC2_` (#5268, #5363)
* Truncate console output in notebooks to avoid hang with long outputs (#5518)
* Fix plain serif/sans-serif font rendering on macOS Catalina (#5525)
* Restore First Project Template feature (Pro #1267)

### Server Pro

* Include Job Launcher logs in diagnostics report (#1262)
* Add ability to specify multiple R versions with same path but differing labels (#1034)
* Include child processes and timing information in session diagnostic traces (#1192) 
* Adds better Session UI/UX including sorting, label viewing, and creation visibility (#1215)
* Respect user profile resource limits for local launcher R sessions (#1269)

