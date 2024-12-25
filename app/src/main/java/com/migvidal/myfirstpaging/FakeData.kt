package com.migvidal.myfirstpaging

val fakeApiResponse = """
    {
      "batchcomplete": "",
      "continue": {
        "sroffset": 40,
        "continue": "-||"
      },
      "query": {
        "searchinfo": {
          "totalhits": 27323,
          "suggestion": "sony",
          "suggestionsnippet": "sony"
        },
        "search": [
          {
            "ns": 0,
            "title": "Sonny",
            "pageid": 5835739,
            "size": 9143,
            "wordcount": 1197,
            "snippet": "<span class=\"searchmatch\">Sonny</span> is a common nickname and occasional given name. Often it can be a derivative of the English word &quot;Son&quot;, a name derived from the Ancient Germanic",
            "timestamp": "2024-11-26T21:59:41Z"
          },
          {
            "ns": 0,
            "title": "Sonny Bono",
            "pageid": 27655,
            "size": 29129,
            "wordcount": 2811,
            "snippet": "Salvatore Phillip &quot;<span class=\"searchmatch\">Sonny</span>&quot; Bono (/\u02c8bo\u028ano\u028a/ BOH-noh; February 16, 1935 \u2013 January 5, 1998) was an American singer, songwriter, actor, and politician. In",
            "timestamp": "2024-12-12T11:30:25Z"
          },
          {
            "ns": 0,
            "title": "Sonny Rollins",
            "pageid": 248413,
            "size": 63539,
            "wordcount": 6245,
            "snippet": "Walter Theodore &quot;<span class=\"searchmatch\">Sonny</span>&quot; Rollins (born September 7, 1930) is an American retired jazz tenor saxophonist who is widely recognized as one of the most important",
            "timestamp": "2024-12-17T12:04:56Z"
          },
          {
            "ns": 0,
            "title": "Sonny & Cher",
            "pageid": 113446,
            "size": 32357,
            "wordcount": 3327,
            "snippet": "<span class=\"searchmatch\">Sonny</span> &amp; Cher were an American pop and entertainment duo in the 1960s and 1970s, made up of spouses <span class=\"searchmatch\">Sonny</span> Bono and Cher. The couple started their career",
            "timestamp": "2024-12-24T00:00:49Z"
          },
          {
            "ns": 0,
            "title": "Sonny Angel",
            "pageid": 73778534,
            "size": 9515,
            "wordcount": 995,
            "snippet": "<span class=\"searchmatch\">Sonny</span> Angel is a line of cherub figurines created by Japanese toy manufacturer Toru Soeya, the CEO of the Japanese company, Dreams Inc. The name is derived",
            "timestamp": "2024-12-13T03:44:37Z"
          },
          {
            "ns": 0,
            "title": "Sonny Corleone",
            "pageid": 1625921,
            "size": 16156,
            "wordcount": 1937,
            "snippet": "Santino &quot;<span class=\"searchmatch\">Sonny</span>&quot; Corleone is a fictional character in Mario Puzo's 1969 novel The Godfather and its 1972 film adaptation. He is the eldest son of the mafia",
            "timestamp": "2024-11-04T23:54:12Z"
          },
          {
            "ns": 0,
            "title": "Sonny Franzese",
            "pageid": 14094327,
            "size": 31684,
            "wordcount": 2743,
            "snippet": "John &quot;<span class=\"searchmatch\">Sonny</span>&quot; Franzese Sr. (Italian: [\u02c8frantse\u02d0ze; -e\u02d0se]; February 6, 1917 \u2013 February 24, 2020) was an American mobster who was a longtime member and",
            "timestamp": "2024-12-01T16:39:02Z"
          },
          {
            "ns": 0,
            "title": "Sonny Liston",
            "pageid": 149549,
            "size": 96132,
            "wordcount": 10386,
            "snippet": "Charles L. &quot;<span class=\"searchmatch\">Sonny</span>&quot; Liston (c.\u20091930 \u2013 December 30, 1970), nicknamed &quot;the Big Bear&quot;, was an American professional boxer who competed from 1953 to 1970.",
            "timestamp": "2024-12-22T18:21:11Z"
          },
          {
            "ns": 0,
            "title": "Cher",
            "pageid": 80696,
            "size": 249084,
            "wordcount": 23758,
            "snippet": "decades. Cher gained fame in 1965 as part of the folk rock husband-wife duo <span class=\"searchmatch\">Sonny</span> &amp; Cher, while also achieving solo success with top-ten singles including",
            "timestamp": "2024-12-24T20:51:25Z"
          },
          {
            "ns": 0,
            "title": "The Sonny & Cher Comedy Hour",
            "pageid": 759912,
            "size": 21623,
            "wordcount": 2477,
            "snippet": "The <span class=\"searchmatch\">Sonny</span> &amp; Cher Comedy Hour is an American variety show starring American pop singers <span class=\"searchmatch\">Sonny</span> Bono and Cher, who were married to each other at the time",
            "timestamp": "2024-12-12T13:15:37Z"
          },
          {
            "ns": 0,
            "title": "Sonny Landham",
            "pageid": 393819,
            "size": 15773,
            "wordcount": 1048,
            "snippet": "William M. &quot;<span class=\"searchmatch\">Sonny</span>&quot; Landham III (February 11, 1941 \u2013 August 17, 2017) was an American actor. He portrayed Billy Bear in 48 Hrs. (1982), tracker Billy Sole",
            "timestamp": "2024-12-22T19:19:29Z"
          },
          {
            "ns": 0,
            "title": "Sonny Corinthos",
            "pageid": 5410717,
            "size": 40761,
            "wordcount": 5184,
            "snippet": "<span class=\"searchmatch\">Sonny</span> Corinthos is a fictional character on the ABC soap opera General Hospital. Maurice Benard has played the role of the manic depressive mob kingpin",
            "timestamp": "2024-11-23T18:32:09Z"
          },
          {
            "ns": 0,
            "title": "Sonny Boy Williamson II",
            "pageid": 296929,
            "size": 20806,
            "wordcount": 2226,
            "snippet": "possibly December 5, 1912 \u2013 May 24, 1965), known later in his career as <span class=\"searchmatch\">Sonny</span> Boy Williamson, was an American blues harmonica player, singer and songwriter",
            "timestamp": "2024-12-07T23:06:02Z"
          },
          {
            "ns": 0,
            "title": "Sonny Bill Williams",
            "pageid": 2725599,
            "size": 134973,
            "wordcount": 11872,
            "snippet": "<span class=\"searchmatch\">Sonny</span> William Williams (born 3 August 1985) is a New Zealand heavyweight boxer, and a former professional rugby league and rugby union player. He is only",
            "timestamp": "2024-12-14T15:46:22Z"
          },
          {
            "ns": 0,
            "title": "Sonny with a Chance",
            "pageid": 19408814,
            "size": 42735,
            "wordcount": 2915,
            "snippet": "<span class=\"searchmatch\">Sonny</span> with a Chance is an American teen sitcom created by Steve Marmel that aired on Disney Channel for two seasons between February 2009 and January",
            "timestamp": "2024-11-16T16:49:47Z"
          },
          {
            "ns": 0,
            "title": "Sonny Chiba",
            "pageid": 415196,
            "size": 59263,
            "wordcount": 2670,
            "snippet": "Sadaho Maeda; 23 January 1939 \u2013 19 August 2021), known internationally as <span class=\"searchmatch\">Sonny</span> Chiba, was a Japanese actor and martial artist. Chiba was one of the first",
            "timestamp": "2024-12-16T02:25:50Z"
          },
          {
            "ns": 0,
            "title": "Skrillex",
            "pageid": 34016927,
            "size": 74040,
            "wordcount": 5678,
            "snippet": "<span class=\"searchmatch\">Sonny</span> John Moore (born January 15, 1988), known professionally as Skrillex, is an American DJ, record producer, and singer. Raised in Northeast Los Angeles",
            "timestamp": "2024-12-21T17:46:02Z"
          },
          {
            "ns": 0,
            "title": "Sonny Barger",
            "pageid": 1136644,
            "size": 157479,
            "wordcount": 17068,
            "snippet": "Ralph Hubert &quot;<span class=\"searchmatch\">Sonny</span>&quot; Barger Jr. (October 8, 1938 \u2013 June 29, 2022) was an American outlaw biker who was a founding member of the Oakland, California chapter",
            "timestamp": "2024-12-15T12:54:30Z"
          },
          {
            "ns": 0,
            "title": "Sonny Landreth",
            "pageid": 2124841,
            "size": 13877,
            "wordcount": 1322,
            "snippet": "Clide Vernon &quot;<span class=\"searchmatch\">Sonny</span>&quot; Landreth (born February 1, 1951) is an American blues musician from southwest Louisiana who is especially known as a slide guitar",
            "timestamp": "2024-11-24T21:45:14Z"
          },
          {
            "ns": 0,
            "title": "Sonny T.",
            "pageid": 1748349,
            "size": 4399,
            "wordcount": 349,
            "snippet": "<span class=\"searchmatch\">Sonny</span> T. (born <span class=\"searchmatch\">Sonny</span> Thompson) is an American bass player. He was a member of The New Power Generation, Prince's recording and stage band, from 1991\u20131996",
            "timestamp": "2024-11-29T01:53:43Z"
          },
          {
            "ns": 0,
            "title": "I, Robot (film)",
            "pageid": 564947,
            "size": 32534,
            "wordcount": 3436,
            "snippet": "gets <span class=\"searchmatch\">Sonny</span> to confess that Lanning made <span class=\"searchmatch\">Sonny</span> promise to do him one favor - to kill him. Spooner declines to arrest <span class=\"searchmatch\">Sonny</span>; as a machine, <span class=\"searchmatch\">Sonny</span> cannot",
            "timestamp": "2024-12-24T16:44:07Z"
          },
          {
            "ns": 0,
            "title": "Sonny Vaccaro",
            "pageid": 12140798,
            "size": 4951,
            "wordcount": 446,
            "snippet": "John Paul Vincent &quot;<span class=\"searchmatch\">Sonny</span>&quot; Vaccaro (born September 23, 1939) is an American former sports marketing executive. He lives in Santa Monica, California. Vaccaro",
            "timestamp": "2024-07-17T18:03:23Z"
          },
          {
            "ns": 0,
            "title": "Dominick Napolitano",
            "pageid": 747893,
            "size": 14909,
            "wordcount": 1645,
            "snippet": "Dominick Napolitano (June 16, 1930 \u2013 August 17, 1981), also known as <span class=\"searchmatch\">Sonny</span> Black, was an American Mafia caporegime in the Bonanno crime family. He is",
            "timestamp": "2024-09-26T22:00:02Z"
          },
          {
            "ns": 0,
            "title": "Al Pacino",
            "pageid": 41906,
            "size": 84599,
            "wordcount": 7476,
            "snippet": "restaurateur in Covina, California. In his teenage years, Pacino was known as &quot;<span class=\"searchmatch\">Sonny</span>&quot; to his friends.:\u200axix\u200a He had ambitions to become a baseball player and",
            "timestamp": "2024-12-25T01:44:02Z"
          },
          {
            "ns": 0,
            "title": "Sonny Boy",
            "pageid": 32370364,
            "size": 1593,
            "wordcount": 230,
            "snippet": "<span class=\"searchmatch\">Sonny</span> Boy or Sunny Boy may refer to: &quot;<span class=\"searchmatch\">Sonny</span> Boy&quot; (song), a 1928 song written by Ray Henderson, Bud De Sylva, and Lew Brown <span class=\"searchmatch\">Sonny</span> Boy (album), a 1961 album",
            "timestamp": "2023-11-05T21:51:40Z"
          },
          {
            "ns": 0,
            "title": "Muhammad Ali vs. Sonny Liston",
            "pageid": 851725,
            "size": 76820,
            "wordcount": 10679,
            "snippet": "The two fights between Muhammad Ali and <span class=\"searchmatch\">Sonny</span> Liston for boxing's World Heavyweight Championship were among the most controversial fights in the sport's",
            "timestamp": "2024-12-11T03:36:48Z"
          },
          {
            "ns": 0,
            "title": "Sonny Perdue",
            "pageid": 339825,
            "size": 54545,
            "wordcount": 4575,
            "snippet": "George Ervin &quot;<span class=\"searchmatch\">Sonny</span>&quot; Perdue III (born December 20, 1946) is an American politician, veterinarian, and businessman who served as the 31st United States",
            "timestamp": "2024-12-09T04:16:01Z"
          },
          {
            "ns": 0,
            "title": "The Education of Sonny Carson",
            "pageid": 14137744,
            "size": 6965,
            "wordcount": 802,
            "snippet": "The Education of <span class=\"searchmatch\">Sonny</span> Carson is a 1974 American blaxploitation drama film based on the best-selling autobiography of <span class=\"searchmatch\">Sonny</span> Carson. The film was directed",
            "timestamp": "2024-12-20T03:09:49Z"
          },
          {
            "ns": 0,
            "title": "Anthony Ciccone",
            "pageid": 7937314,
            "size": 5195,
            "wordcount": 417,
            "snippet": "Anthony &quot;<span class=\"searchmatch\">Sonny</span>&quot; Ciccone (born July 19, 1934) is a New York City mobster and a captain of the Gambino crime family. For over twenty years, Ciccone controlled",
            "timestamp": "2023-12-09T23:15:40Z"
          },
          {
            "ns": 0,
            "title": "Al Indelicato",
            "pageid": 1063321,
            "size": 12385,
            "wordcount": 1261,
            "snippet": "Alphonse &quot;Al&quot; Indelicato (February 25, 1931 \u2013 May 5, 1981), also known as <span class=\"searchmatch\">Sonny</span> Red, was an American mobster and caporegime in the Bonanno crime family",
            "timestamp": "2024-05-28T18:56:22Z"
          },
          {
            "ns": 0,
            "title": "Sonny Dykes",
            "pageid": 20790019,
            "size": 68622,
            "wordcount": 5757,
            "snippet": "Daniel &quot;<span class=\"searchmatch\">Sonny</span>&quot; Dykes (born November 9, 1969) is an American football coach, and a former college baseball player. He is currently the head football coach",
            "timestamp": "2024-12-08T23:34:50Z"
          },
          {
            "ns": 0,
            "title": "Sonny Red",
            "pageid": 7779284,
            "size": 4706,
            "wordcount": 375,
            "snippet": "1981), known as <span class=\"searchmatch\">Sonny</span> Red, was an American jazz alto saxophonist and composer associated with the hard bop idiom among other styles. <span class=\"searchmatch\">Sonny</span> Red played with",
            "timestamp": "2024-07-09T20:02:09Z"
          },
          {
            "ns": 0,
            "title": "Sonny Jurgensen",
            "pageid": 854680,
            "size": 25771,
            "wordcount": 2008,
            "snippet": "Christian Adolph &quot;<span class=\"searchmatch\">Sonny</span>&quot; Jurgensen III (born August 23, 1934) is an American former professional football quarterback in the National Football League",
            "timestamp": "2024-12-23T00:46:29Z"
          },
          {
            "ns": 0,
            "title": "Sonny Drane",
            "pageid": 20986546,
            "size": 3966,
            "wordcount": 497,
            "snippet": "<span class=\"searchmatch\">Sonny</span> Drane (born 13 March 1939) (sometimes referred to as &quot;<span class=\"searchmatch\">Sonny</span> Freeman Drane&quot;), is a German-born woman who was briefly popular as a model in Britain",
            "timestamp": "2024-08-28T16:13:08Z"
          },
          {
            "ns": 0,
            "title": "Sonny Bradley",
            "pageid": 34327821,
            "size": 29918,
            "wordcount": 2474,
            "snippet": "<span class=\"searchmatch\">Sonny</span> Bradley (born 13 September 1991) is an English professional footballer who plays as a centre-back for EFL Championship club Derby County. He has",
            "timestamp": "2024-12-22T03:35:48Z"
          },
          {
            "ns": 0,
            "title": "Cocoa Puffs",
            "pageid": 1684779,
            "size": 7072,
            "wordcount": 776,
            "snippet": "squares.&quot; The mascot of Cocoa Puffs, <span class=\"searchmatch\">Sonny</span>, an orange Cuckoo bird, was introduced in 1962. In most commercials, <span class=\"searchmatch\">Sonny</span> attempts to stay away from his favorite",
            "timestamp": "2024-10-21T23:22:57Z"
          },
          {
            "ns": 0,
            "title": "Sonny Hall",
            "pageid": 64861027,
            "size": 8460,
            "wordcount": 732,
            "snippet": "<span class=\"searchmatch\">Sonny</span> Hall (born 10 June 1998) is an English model, artist and poet. Hall released his debut poetry collection, The Blues Comes With Good News, through",
            "timestamp": "2024-11-18T09:34:09Z"
          },
          {
            "ns": 0,
            "title": "Sonny Aljofree",
            "pageid": 77759502,
            "size": 7252,
            "wordcount": 350,
            "snippet": "<span class=\"searchmatch\">Sonny</span> Aljofree (born 19 December 2004) is an English professional footballer who plays for Accrington Stanley, on loan from Manchester United, as a defender",
            "timestamp": "2024-12-21T17:47:10Z"
          },
          {
            "ns": 0,
            "title": "Sonny James discography",
            "pageid": 26156860,
            "size": 23308,
            "wordcount": 69,
            "snippet": "The article presents a discography for American country artist <span class=\"searchmatch\">Sonny</span> James. A^ &quot;Since I Met You Baby&quot; also peaked at number 38 on the RPM Adult Contemporary",
            "timestamp": "2024-07-08T18:45:15Z"
          },
          {
            "ns": 0,
            "title": "Sonny Montgomery",
            "pageid": 2097855,
            "size": 19664,
            "wordcount": 1766,
            "snippet": "Gillespie V. &quot;<span class=\"searchmatch\">Sonny</span>&quot; Montgomery (August 5, 1920 \u2013 May 12, 2006) was an American soldier and politician from Mississippi who served in the Mississippi",
            "timestamp": "2024-12-17T00:18:00Z"
          }
        ]
      }
    }
""".trimIndent()