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

- 05.19 - crawled NBA Players' regular season stats (very very difficult for me(for now...))
  - www.nba.com/stats/player/{player_id} is a dynamic web page. All stats of each player are changed when I change the options I want to see.
  - so, I used Selenium and Chrome Driver for crawling, for Jsoup is not available for this type of work (dynamic web page crawling). 
  - I had some difficulties and mistakes listed below.
    1. I thought it'll be better to serve a real-time data crawling(?), which means when people enter my website, people can see the real-time data of players' stats. However, it was fundamentally impossible to use selenium in Spring-boot. I didn't know it at first, so I wasted so many time finding mistakes that make selenium not work in Spring-boot... 
    2. Luckily, I finally found the truth(Selenium doesn't work in Spring-boot), so I decided to divide providing player stat function into two stages. First, updating data. I'll take changed data from NBA.com at 00:00 everyday and update the database of our server. Second, server will provide player stat based on data from our database(this would be implemented by JQuad). 
    3. So today, I made two functions. One is to connect DB and Eclipse, and the other is to gather data from nba.com using selenium.
