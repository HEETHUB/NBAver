# NBAver

- Pair Project with JQuad
- We're making Korean NBA website providing various information about NBA including player stats, matches.

### commits by myself(HEET)
- 05.17 - first commit : build basic architecture 
  - Spring boot, MVC pattern
  - created basic Database using MySql
  - implemented website user management(registration, log in, log out) -> used session-based log in function. I'm planning to change it to token-based. 

- 05.18 - made Database of NBA players
  - NBAPlayer DTO includes player's name, id, and NBA link. 
  - linked DB and server : controller -> service -> dao
