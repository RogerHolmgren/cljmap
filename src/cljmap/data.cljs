(ns cljmap.data)

(def json-input "{
  \"type\": \"FeatureCollection\",
  \"features\": [
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.205290150756838,
          55.70037360320053
        ]
      },
      \"properties\": { \"address\": \"Dalbyvägen\" }
    }
  ]
}")

(def json-input-bak
"{
  \"type\": \"FeatureCollection\",
  \"features\": [
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.205290150756838,
          55.70037360320053
        ]
      },
      \"properties\": {
        \"address\": \"Dalbyvägen\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-14\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20210503-0908\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"Generell TA-plan för trädarbeten utmed väg och/eller GC-bana\",
        \"applicant\": \"Svearb AB\",
        \"start-date\": \"2023-04-14\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.218017977459503,
          55.72697781014705
        ]
      },
      \"properties\": {
        \"address\": \"Generell AT-plan för Målning Handläggning\",
        \"worktypes\": [],
        \"end-date\": \"2023-12-29\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20221005-2317\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Svevia AB\",
        \"start-date\": \"2022-10-17\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.20976880964543,
          55.692744100274
        ]
      },
      \"properties\": {
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2022-11-30\",
        \"estimated-effects\": {
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20221025-2454\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Kraftringen Nät AB\",
        \"start-date\": \"2022-11-02\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.20759667199708,
          55.728186958570575
        ]
      },
      \"properties\": {
        \"address\": \"Vittnesgränden 1, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-15\",
        \"estimated-effects\": {
          \"8\": {
            \"id\": \"8\",
            \"name\": \"Trafikvakter på plats\",
            \"order\": 8
          }
        },
        \"name\": \"20221101-2505\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Svevia AB\",
        \"start-date\": \"2022-11-14\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.199222226729995,
          55.6957597035109
        ]
      },
      \"properties\": {
        \"address\": \"Kastanjegatan 17, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20221103-2533\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"PVS Mark & Anläggning AB\",
        \"start-date\": \"2022-11-07\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.344057358738448,
          55.66575947901652
        ]
      },
      \"properties\": {
        \"address\": \"Lundavägen, Dalby\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-06\",
        \"estimated-effects\": {
          \"4\": {
            \"id\": \"4\",
            \"name\": \"Väg avstängd\",
            \"order\": 4
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20221115-2609\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"3\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2022-11-24\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.340362422624894,
          55.660700882961
        ]
      },
      \"properties\": {
        \"address\": \"Pumpvägen 5, Dalby\",
        \"worktypes\": [],
        \"end-date\": \"2022-12-22\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20221209-2728\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Peab Anläggning\",
        \"start-date\": \"2022-12-12\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.223764647557767,
          55.724267232945884
        ]
      },
      \"properties\": {
        \"address\": \"Utbrytningsgränden 1F, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-01-18\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20221212-2736\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Kraftringen Fiber AB\",
        \"start-date\": \"2022-12-22\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.192689701734137,
          55.701613107493344
        ]
      },
      \"properties\": {
        \"address\": \"Västra Mårtensgatan 1, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-10\",
        \"estimated-effects\": {
          \"3\": {
            \"id\": \"3\",
            \"name\": \"Flera körfält avstängda\",
            \"order\": 3
          },
          \"4\": {
            \"id\": \"4\",
            \"name\": \"Väg avstängd\",
            \"order\": 4
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20221222-2808\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"3\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"MVB Syd AB\",
        \"start-date\": \"2023-01-30\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.201040147611586,
          55.754776717624935
        ]
      },
      \"properties\": {
        \"address\": \"Rossings väg, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-02-10\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230104-0022\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Cablequick AB\",
        \"start-date\": \"2023-01-10\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.203172792571456,
          55.69925874773855
        ]
      },
      \"properties\": {
        \"address\": \"Brunnsgatan 20, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-01-26\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230110-0037\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Svevia\",
        \"start-date\": \"2023-01-26\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.238539773957045,
          55.69959940912677
        ]
      },
      \"properties\": {
        \"address\": \"Ragnar Lodbroks gränd 4, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-01-18\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          }
        },
        \"name\": \"20230110-0038\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Svevia\",
        \"start-date\": \"2023-01-18\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.192132801537019,
          55.69239416087454
        ]
      },
      \"properties\": {
        \"address\": \"Mellanvångsvägen 12, Lund ( endast för att markera i kartan. Gäller Område 2. Tömning av dagvattenbrunnar\",
        \"worktypes\": [],
        \"end-date\": \"2024-03-31\",
        \"estimated-effects\": {
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230130-0206\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Sydvac\",
        \"start-date\": \"2023-01-30\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.194105423248956,
          55.688136742577825
        ]
      },
      \"properties\": {
        \"address\": \"Landerigränden 1, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-14\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230210-0312\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Cablequick AB\",
        \"start-date\": \"2023-02-17\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.193730770567317,
          55.70155342258504
        ]
      },
      \"properties\": {
        \"address\": \"Västra Mårtensgatan 6B, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-02\",
        \"estimated-effects\": {
          \"3\": {
            \"id\": \"3\",
            \"name\": \"Flera körfält avstängda\",
            \"order\": 3
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20230227-0437\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"3\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"MVB Syd AB\",
        \"start-date\": \"2023-03-10\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.1779447,
          55.7272345
        ]
      },
      \"properties\": {
        \"address\": \"Jaktstigen, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-03-24\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230227-0458\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Kraftringen Service AB\",
        \"start-date\": \"2023-03-17\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.19191271056753,
          55.700686926736196
        ]
      },
      \"properties\": {
        \"address\": \"Stora Södergatan 8 C, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-21\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          }
        },
        \"name\": \"20230306-0542\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Skanova\",
        \"start-date\": \"2023-04-03\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.223869217537123,
          55.71016623116293
        ]
      },
      \"properties\": {
        \"address\": \"Östratornsvägen 1A, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230306-0548\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Kraftringen Service AB\",
        \"start-date\": \"2023-03-14\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.24631648784074,
          55.70223678672382
        ]
      },
      \"properties\": {
        \"address\": \"Valdemars väg 51, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230306-0550\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Kraftringen Service AB\",
        \"start-date\": \"2023-03-14\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.190685201273839,
          55.70650814206879
        ]
      },
      \"properties\": {
        \"address\": \"Sankt Petri kyrkogata, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-14\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230307-0556\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2023-04-03\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.189631168124798,
          55.71714332001822
        ]
      },
      \"properties\": {
        \"address\": \"möllevångs v\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-05\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230307-0558\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2023-03-29\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.229013712303148,
          55.69106380695995
        ]
      },
      \"properties\": {
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-03-24\",
        \"estimated-effects\": {
          \"vagren\": {
            \"id\": \"vagren\",
            \"name\": \"Dike/vägren\",
            \"order\": 3
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230307-0571\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Kraftringen Service AB\",
        \"start-date\": \"2023-03-17\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.217806020192047,
          55.700164002564605
        ]
      },
      \"properties\": {
        \"address\": \"Östra Fäladsvägen 37, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-05-31\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230309-0587\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Tekniska förvaltningen\",
        \"start-date\": \"2023-03-20\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.205077198880785,
          55.6982708523468
        ]
      },
      \"properties\": {
        \"address\": \"Ulrikedalsvägen, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230309-0593\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Kraftringen Service AB\",
        \"start-date\": \"2023-03-24\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.210949134945608,
          55.69944484444501
        ]
      },
      \"properties\": {
        \"address\": \"Dalbyvägen 20, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230313-0612\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"PULS AB\",
        \"start-date\": \"2023-03-30\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.196061571153574,
          55.70652575330608
        ]
      },
      \"properties\": {
        \"address\": \"Sandgatan 10, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230313-0613\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2023-03-29\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.227679491723169,
          55.71882311391662
        ]
      },
      \"properties\": {
        \"address\": \"Solbjersvägen, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-04\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230314-0629\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"RentSafe Sverige AB\",
        \"start-date\": \"2023-04-04\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.239031311569978,
          55.71055134801569
        ]
      },
      \"properties\": {
        \"address\": \"Flygelvägen, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-10\",
        \"estimated-effects\": {
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230315-0643\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Kraftringen Service AB\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.162240809053793,
          55.70589123353272
        ]
      },
      \"properties\": {
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-14\",
        \"estimated-effects\": {
          \"vagren\": {
            \"id\": \"vagren\",
            \"name\": \"Dike/vägren\",
            \"order\": 3
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230315-0646\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Kraftringen Service AB\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.191823886508182,
          55.69936606464226
        ]
      },
      \"properties\": {
        \"address\": \"Stora Tvärgatan, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-14\",
        \"estimated-effects\": {
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230315-0652\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Kraftringen Service AB\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.350644009064684,
          55.71673775461282
        ]
      },
      \"properties\": {
        \"address\": \"Granstigen 1, Södra Sandby\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-23\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"uphill\": {
            \"id\": \"uphill\",
            \"name\": \"Motlut\",
            \"order\": 9
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20230316-0669\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Cablequick AB\",
        \"start-date\": \"2023-03-24\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.229988386348142,
          55.71780329181244
        ]
      },
      \"properties\": {
        \"address\": \"Programmeraregatan\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-12\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230316-0672\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"VA Syd\",
        \"start-date\": \"2023-03-29\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.181552180145827,
          55.7111596787682
        ]
      },
      \"properties\": {
        \"address\": \"Fabriksgatan 15, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-12\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230316-0676\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Transtema Network Services\",
        \"start-date\": \"2023-04-11\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.503310859551112,
          55.628563261289074
        ]
      },
      \"properties\": {
        \"address\": \"Mäster Knuds väg 101, Veberöd\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-13\",
        \"estimated-effects\": {
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230317-0683\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Jonab anläggnings AB\",
        \"start-date\": \"2023-04-10\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.178120106330041,
          55.69970456275431
        ]
      },
      \"properties\": {
        \"address\": \"Åkerlund & Rausings väg, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-14\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"GC-trafik leds förbi arbetsplatsen\",
            \"order\": 99
          }
        },
        \"name\": \"20230320-0688\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Tekniska förvaltningen\",
        \"start-date\": \"2023-03-31\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.183175192007894,
          55.693350274808004
        ]
      },
      \"properties\": {
        \"address\": \"Östanväg 3, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-21\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230320-0691\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Transtema Network Services\",
        \"start-date\": \"2023-04-05\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.201562911746487,
          55.7013676256816
        ]
      },
      \"properties\": {
        \"address\": \"Östervångsvägen 2, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-07\",
        \"estimated-effects\": {
          \"4\": {
            \"id\": \"4\",
            \"name\": \"Väg avstängd\",
            \"order\": 4
          },
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20230320-0699\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"3\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2023-04-03\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.221243189434352,
          55.70390153605275
        ]
      },
      \"properties\": {
        \"address\": \"Vipeholms Allé 11, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-28\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230322-0730\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Cablequick AB\",
        \"start-date\": \"2023-03-30\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.24347818366673,
          55.702052939529615
        ]
      },
      \"properties\": {
        \"address\": \"Angantyrs gränd 6, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-21\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230322-0732\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Cablequick AB\",
        \"start-date\": \"2023-03-24\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.15747358698589,
          55.71822598348667
        ]
      },
      \"properties\": {
        \"address\": \"Traktorvägen 12, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-01\",
        \"estimated-effects\": {
          \"4\": {
            \"id\": \"4\",
            \"name\": \"Väg avstängd\",
            \"order\": 4
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230322-0733\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2023-03-29\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.190561543531993,
          55.711984254609504
        ]
      },
      \"properties\": {
        \"address\": \"Kävlingevägen 7, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-28\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 1
          }
        },
        \"name\": \"20230322-0735\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2023-03-28\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.239134007968042,
          55.70414487905501
        ]
      },
      \"properties\": {
        \"address\": \"Mårtenslovsvägen 25, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-21\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          }
        },
        \"name\": \"20230322-0736\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Cablequick AB\",
        \"start-date\": \"2023-03-24\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.358352370569584,
          55.71553732541153
        ]
      },
      \"properties\": {
        \"address\": \"Östervång 10, Södra Sandby\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-21\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230323-0744\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Cablequick AB\",
        \"start-date\": \"2023-03-24\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.363520816183673,
          55.71745677875129
        ]
      },
      \"properties\": {
        \"address\": \"Öståkravägen 1, Södra Sandby\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-21\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230323-0745\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Cablequick AB\",
        \"start-date\": \"2023-03-24\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.362093050301151,
          55.71778504763971
        ]
      },
      \"properties\": {
        \"address\": \"Öståkravägen 15, Södra Sandby\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-21\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230323-0746\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Cablequick AB\",
        \"start-date\": \"2023-03-24\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.192848082449359,
          55.74934685550344
        ]
      },
      \"properties\": {
        \"address\": \"18, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-24\",
        \"estimated-effects\": {
          \"4\": {
            \"id\": \"4\",
            \"name\": \"Väg avstängd\",
            \"order\": 4
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20230323-0752\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"3\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Skanska Industrial Solutions AB\",
        \"start-date\": \"2023-03-24\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.246514916996928,
          55.6907983000375
        ]
      },
      \"properties\": {
        \"address\": \"Runslingan 24D, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-29\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230323-0756\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Amparo Solutions AB\",
        \"start-date\": \"2023-03-29\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.17600422580837,
          55.681004389276076
        ]
      },
      \"properties\": {
        \"address\": \"Sankt Lars väg, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-29\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230323-0757\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Amparo Solutions AB\",
        \"start-date\": \"2023-03-29\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.231607159010336,
          55.68952654045784
        ]
      },
      \"properties\": {
        \"address\": \"Agronomvägen 15, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-14\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230324-0758\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2023-04-10\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.233321829418955,
          55.717745891334076
        ]
      },
      \"properties\": {
        \"address\": \"Solbjerstorget 6, 224 81 Lund, Sverige\",
        \"worktypes\": {
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 11
          }
        },
        \"end-date\": \"2022-01-30\",
        \"estimated-effects\": {
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          },
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          }
        },
        \"name\": \"20210820-1519\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2021-08-20\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.23334430185243,
          55.71797272808585
        ]
      },
      \"properties\": {
        \"address\": \"Solbjersvägen, Lund, Sverige\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2022-01-30\",
        \"estimated-effects\": {
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20210831-1610\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2021-08-31\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.499728110086249,
          55.628595402886475
        ]
      },
      \"properties\": {
        \"address\": \"Mäster Knuds väg 48, 247 61 Veberöd, Sverige\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-28\",
        \"estimated-effects\": {
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20220420-0940\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2022-05-02\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.181682605526882,
          55.73449038946349
        ]
      },
      \"properties\": {
        \"address\": \"Korsåkersvägen 40, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-09-29\",
        \"estimated-effects\": {
          \"vagren\": {
            \"id\": \"vagren\",
            \"name\": \"Dike/vägren\",
            \"order\": 3
          }
        },
        \"name\": \"20220705-1589\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2022-08-22\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.190081409928677,
          55.74511951547975
        ]
      },
      \"properties\": {
        \"address\": \"Gästabudsvägen 20, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"park\": {
            \"id\": \"park\",
            \"name\": \"Park\",
            \"order\": 10
          }
        },
        \"name\": \"20220705-1590\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-01-02\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.189169458863613,
          55.748054357733125
        ]
      },
      \"properties\": {
        \"address\": \"Soldat Skalks gata 2, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          },
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-05-31\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          },
          \"vagren\": {
            \"id\": \"vagren\",
            \"name\": \"Dike/vägren\",
            \"order\": 3
          }
        },
        \"name\": \"20220705-1591\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2022-11-28\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.242903941394397,
          55.729998961537746
        ]
      },
      \"properties\": {
        \"address\": \"Odarslövsvägen, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2026-08-31\",
        \"estimated-effects\": {
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 1
          }
        },
        \"name\": \"20220831-1984\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2022-08-31\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.200851366071186,
          55.74790610195887
        ]
      },
      \"properties\": {
        \"address\": \"Bomvägen 26, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          },
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20220905-2036\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2022-09-20\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.209162621076848,
          55.722672511222214
        ]
      },
      \"properties\": {
        \"address\": \"Magistratsvägen 53D, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-28\",
        \"estimated-effects\": {
          \"park\": {
            \"id\": \"park\",
            \"name\": \"Park\",
            \"order\": 10
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20220906-2044\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2022-09-12\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.183913820050384,
          55.721088071531106
        ]
      },
      \"properties\": {
        \"address\": \"Sliparebacken 1, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"park\": {
            \"id\": \"park\",
            \"name\": \"Park\",
            \"order\": 10
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"vagren\": {
            \"id\": \"vagren\",
            \"name\": \"Dike/vägren\",
            \"order\": 3
          }
        },
        \"name\": \"20220914-2130\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2022-09-19\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.20976880964543,
          55.692744100274
        ]
      },
      \"properties\": {
        \"address\": \"Råbyvägen 37, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20220914-2137\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2022-10-17\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.174979084735421,
          55.69788883496312
        ]
      },
      \"properties\": {
        \"address\": \"Parkvägen 1B, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 11
          }
        },
        \"end-date\": \"2023-03-28\",
        \"estimated-effects\": {
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          }
        },
        \"name\": \"20221111-2585\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-01-28\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.158705383354796,
          55.72107211689298
        ]
      },
      \"properties\": {
        \"address\": \"Höstbruksvägen 14, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-20\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20221114-2589\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2022-11-28\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.165988763535923,
          55.72127027977172
        ]
      },
      \"properties\": {
        \"address\": \"Arkeologvägen 2, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-05-12\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20221117-2623\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-20\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.23014692065794,
          55.77626643024183
        ]
      },
      \"properties\": {
        \"address\": \"Nybyggesvägen 2, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-05-31\",
        \"estimated-effects\": {
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20221128-2661\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2022-11-28\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.175995371202962,
          55.72350754451793
        ]
      },
      \"properties\": {
        \"address\": \"Soldatgatan 12, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-05-26\",
        \"estimated-effects\": {
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          },
          \"parking-lot\": {
            \"id\": \"parking-lot\",
            \"name\": \"Parkering\",
            \"order\": 11
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20221219-2776\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-07\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.228231633838877,
          55.69181504435481
        ]
      },
      \"properties\": {
        \"address\": \"Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-12-20\",
        \"estimated-effects\": [],
        \"name\": \"20221220-2780\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2022-12-20\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.17527038932691,
          55.72493939478223
        ]
      },
      \"properties\": {
        \"address\": \"Jaktparken\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-05-05\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20230111-0063\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-02-02\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.397154871977039,
          55.59809146896272
        ]
      },
      \"properties\": {
        \"address\": \"Genakärrsvägen 7, Genarp\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230119-0130\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-01-19\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.209658424760438,
          55.68298946528537
        ]
      },
      \"properties\": {
        \"address\": \"Sellerigatan 12, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2024-03-29\",
        \"estimated-effects\": {
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          }
        },
        \"name\": \"20230120-0134\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-01-26\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.196598724732151,
          55.70152076447034
        ]
      },
      \"properties\": {
        \"address\": \"Mårtenstorget 10, Lund\",
        \"worktypes\": {
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 11
          }
        },
        \"end-date\": \"2023-04-14\",
        \"estimated-effects\": {
          \"square\": {
            \"id\": \"square\",
            \"name\": \"Torgyta\",
            \"order\": 12
          },
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          },
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          }
        },
        \"name\": \"20230124-0162\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-06\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.212072878707213,
          55.689530594008836
        ]
      },
      \"properties\": {
        \"address\": \"Skiffervägen 102A, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230130-0194\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-02-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.177082552464299,
          55.740123779144064
        ]
      },
      \"properties\": {
        \"address\": \"Liggaregränden 8, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-10\",
        \"estimated-effects\": {
          \"uphill\": {
            \"id\": \"uphill\",
            \"name\": \"Motlut\",
            \"order\": 9
          }
        },
        \"name\": \"20230203-0254\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-13\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.173370588015842,
          55.69642995326313
        ]
      },
      \"properties\": {
        \"address\": \"Maskinvägen 1, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20230208-0287\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-20\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.194121512542454,
          55.68822523174682
        ]
      },
      \"properties\": {
        \"address\": \"Landerigränden 1, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230209-0300\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-02-13\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.18576975566038,
          55.69378559131236
        ]
      },
      \"properties\": {
        \"address\": \"Dalslandsvägen 6, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-15\",
        \"estimated-effects\": {
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          }
        },
        \"name\": \"20230216-0349\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-02-22\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.188054067520486,
          55.69484732290373
        ]
      },
      \"properties\": {
        \"address\": \"Ringvägen 1A, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-05-10\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20230216-0355\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-20\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.195142697578346,
          55.71819038842586
        ]
      },
      \"properties\": {
        \"address\": \"Margaretavägen 2, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-03-30\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20230217-0374\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-02-28\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.176274760653616,
          55.72281202144266
        ]
      },
      \"properties\": {
        \"address\": \"Danska vägen 46, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          }
        },
        \"name\": \"20230220-0378\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-01\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.354945470378583,
          55.669068288640354
        ]
      },
      \"properties\": {
        \"address\": \"Norra Fäladsvägen 16, Dalby\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-14\",
        \"estimated-effects\": {
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20230220-0380\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.245618188872411,
          55.70365620471152
        ]
      },
      \"properties\": {
        \"address\": \"Fylkingavägen 18, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-03-28\",
        \"estimated-effects\": {
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230220-0385\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-14\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.510093553797805,
          55.628718379119086
        ]
      },
      \"properties\": {
        \"address\": \"Utåkersvägen 12, Veberöd\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-28\",
        \"estimated-effects\": {
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230221-0396\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-13\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.185750573691646,
          55.683347016546776
        ]
      },
      \"properties\": {
        \"address\": \"Malmövägen 75, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-16\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230224-0424\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-13\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.231913475425769,
          55.71973111708339
        ]
      },
      \"properties\": {
        \"address\": \"Vetenskapsgatan 4A, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-07\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 1
          }
        },
        \"name\": \"20230227-0433\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-16\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.20477809795256,
          55.71502426020442
        ]
      },
      \"properties\": {
        \"address\": \"Onsjögatan 10, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-12\",
        \"estimated-effects\": {
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230227-0453\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-13\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.18939612031642,
          55.68331674973305
        ]
      },
      \"properties\": {
        \"address\": \"Tors väg 20, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-03-27\",
        \"estimated-effects\": {
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230228-0477\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-13\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.215980857241911,
          55.69595491037633
        ]
      },
      \"properties\": {
        \"address\": \"Fältspatvägen 4, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-06-14\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230301-0499\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-08\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.393819111695402,
          55.59384178301386
        ]
      },
      \"properties\": {
        \"address\": \"Hjortstigen 3B, Genarp\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-03\",
        \"estimated-effects\": {
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230302-0512\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-20\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.246300394586651,
          55.702344096554825
        ]
      },
      \"properties\": {
        \"address\": \"Valdemars väg 47, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-30\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230306-0549\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.392568854899789,
          55.60024363653797
        ]
      },
      \"properties\": {
        \"address\": \"Bankerudsgatan 10, Genarp\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-13\",
        \"estimated-effects\": {
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230308-0576\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-22\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.394605304879716,
          55.600139031070476
        ]
      },
      \"properties\": {
        \"address\": \"Bankerudsgatan 1, Genarp\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-10\",
        \"estimated-effects\": {
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230308-0581\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.249846446087966,
          55.7039166933636
        ]
      },
      \"properties\": {
        \"address\": \"Hugins väg 10, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-14\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230309-0596\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-17\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.33547673552105,
          55.7205707026454
        ]
      },
      \"properties\": {
        \"address\": \"Pilvägen 21, Södra Sandby\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-03-28\",
        \"estimated-effects\": {
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230314-0624\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-14\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.193684231840525,
          55.74971961997553
        ]
      },
      \"properties\": {
        \"address\": \"Vallkärravägen 18, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-03-22\",
        \"estimated-effects\": {
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230323-0755\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-22\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.191007300000024,
          55.7046601
        ]
      },
      \"properties\": {
        \"address\": \"Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2023-12-31\",
        \"estimated-effects\": {
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 2
          },
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 5
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 8
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          },
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 3
          },
          \"vagren\": {
            \"id\": \"vagren\",
            \"name\": \"Dike/vägren\",
            \"order\": 6
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 1
          },
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 4
          },
          \"park\": {
            \"id\": \"park\",
            \"name\": \"Park\",
            \"order\": 7
          }
        },
        \"name\": \"20190326-0475\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Kraftringen Service AB\",
        \"start-date\": \"2019-03-26\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.20400931006469,
          55.711380067349936
        ]
      },
      \"properties\": {
        \"address\": \"Sölvegatan 19, Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-30\",
        \"estimated-effects\": {
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20200507-0903\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Skanska Sverige AB\",
        \"start-date\": \"2020-05-25\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.202744886787569,
          55.7108671952075
        ]
      },
      \"properties\": {
        \"address\": \"Sölvegatan 19, Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-30\",
        \"estimated-effects\": {
          \"parking-lot\": {
            \"id\": \"parking-lot\",
            \"name\": \"Parkering\",
            \"order\": 11
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20200915-1692\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Skanska Sverige AB\",
        \"start-date\": \"2020-10-12\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.1744625,
          55.6969204
        ]
      },
      \"properties\": {
        \"address\": \"Åkerlund & Rausings väg, 227 30 Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20200928-1785\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"Schaktning för ny GC-tunnel.\",
        \"applicant\": \"Ramirent AB\",
        \"start-date\": \"2022-05-31\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.18217647322462,
          55.70174694313271
        ]
      },
      \"properties\": {
        \"address\": \"Möllegatan, Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2023-06-30\",
        \"estimated-effects\": {
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20210122-0125\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"Utökning av byggarbetsplats.\",
        \"applicant\": \"Skanska Sverige AB\",
        \"start-date\": \"2021-02-01\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.227660866748048,
          55.694592810394404
        ]
      },
      \"properties\": {
        \"address\": \"Sydöstra vägen, Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2023-02-28\",
        \"estimated-effects\": {
          \"4\": {
            \"id\": \"4\",
            \"name\": \"Väg avstängd\",
            \"order\": 4
          },
          \"vagren\": {
            \"id\": \"vagren\",
            \"name\": \"Dike/vägren\",
            \"order\": 3
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Anslutning till byggväg\",
            \"order\": 99
          }
        },
        \"name\": \"20210201-0200\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"Anläggning av byggväg mellan Prästavägen och Sydöstra vägen\",
        \"applicant\": \"Lambertsson AB\",
        \"start-date\": \"2021-03-01\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.211147621986012,
          55.72046620910697
        ]
      },
      \"properties\": {
        \"address\": \"Magistratsvägen, Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2023-02-28\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"GC-VÄG AVSTÄNGDD\",
            \"order\": 99
          }
        },
        \"name\": \"20210311-0492\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Skanska Sverige AB\",
        \"start-date\": \"2021-03-15\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.1838242,
          55.702326
        ]
      },
      \"properties\": {
        \"address\": \"Svanevägen, Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2022-12-31\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Smalare gc väg\",
            \"order\": 99
          }
        },
        \"name\": \"20210407-0650\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"Breddning av arbetsområdet\",
        \"applicant\": \"Skanska Sverige AB\",
        \"start-date\": \"2021-05-03\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.191007300000024,
          55.7046601
        ]
      },
      \"properties\": {
        \"address\": \"Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2023-12-31\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"3\": {
            \"id\": \"3\",
            \"name\": \"Flera körfält avstängda\",
            \"order\": 3
          },
          \"4\": {
            \"id\": \"4\",
            \"name\": \"Väg avstängd\",
            \"order\": 4
          },
          \"5\": {
            \"id\": \"5\",
            \"name\": \"Tunnel avstängd\",
            \"order\": 5
          },
          \"6\": {
            \"id\": \"6\",
            \"name\": \"Påfart avstängd\",
            \"order\": 6
          },
          \"7\": {
            \"id\": \"7\",
            \"name\": \"Avfart avstängd\",
            \"order\": 7
          },
          \"8\": {
            \"id\": \"8\",
            \"name\": \"Trafikvakter på plats\",
            \"order\": 8
          },
          \"9\": {
            \"id\": \"9\",
            \"name\": \"Trafiksignal släkt, trafikvakter på plats\",
            \"order\": 9
          },
          \"10\": {
            \"id\": \"10\",
            \"name\": \"Trafik regleras med skyttelsignal\",
            \"order\": 10
          },
          \"11\": {
            \"id\": \"11\",
            \"name\": \"Trafik regleras med lots\",
            \"order\": 11
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          },
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          },
          \"uphill\": {
            \"id\": \"uphill\",
            \"name\": \"Motlut\",
            \"order\": 9
          },
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          },
          \"vagren\": {
            \"id\": \"vagren\",
            \"name\": \"Dike/vägren\",
            \"order\": 3
          },
          \"square\": {
            \"id\": \"square\",
            \"name\": \"Torgyta\",
            \"order\": 12
          },
          \"parking-lot\": {
            \"id\": \"parking-lot\",
            \"name\": \"Parkering\",
            \"order\": 11
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          },
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"park\": {
            \"id\": \"park\",
            \"name\": \"Park\",
            \"order\": 10
          }
        },
        \"name\": \"20210430-0892\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"Generell TA plan för byte av sedvanliga intermittenta arbeten på gatubelysningen.\",
        \"applicant\": \"Kraftringen Service AB\",
        \"start-date\": \"2021-04-30\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.191255128836064,
          55.70404987212947
        ]
      },
      \"properties\": {
        \"address\": \"Stora Gråbrödersgatan, Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2024-02-28\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20210507-0955\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"Arbete med trafiksignaler och fräsning av detektorslingor i trafiksignalanläggningar\",
        \"applicant\": \"Swarco Sverige ab\",
        \"start-date\": \"2021-05-03\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.2095856,
          55.6879737
        ]
      },
      \"properties\": {
        \"address\": \"Malin Gyllenkroks väg 2, 224 78 Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2022-07-30\",
        \"estimated-effects\": {
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20210802-1424\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"Nybyggnation av kök och matsal till Stora Råby 32:23 GC-vägen som går förbi behöver stängas under byggtiden.\",
        \"applicant\": \"Ramudden ab\",
        \"start-date\": \"2021-08-31\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.1550703,
          55.7142478
        ]
      },
      \"properties\": {
        \"address\": \"Avtalsvägen 2, 227 61 Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2022-03-31\",
        \"estimated-effects\": {
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20211105-2107\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"Omledning cykelväg och gångväg tidvis under perioden vid schakt.\",
        \"applicant\": \"Skanska Sverige AB\",
        \"start-date\": \"2021-11-15\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.218225667805825,
          55.71101177672269
        ]
      },
      \"properties\": {
        \"address\": \"Scheelevägen 5\",
        \"worktypes\": [],
        \"end-date\": \"2024-11-22\",
        \"estimated-effects\": {
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20211117-2216\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"Tillfällig utfart mot Scheelevägen.\",
        \"applicant\": \"Berg&Dahl arkitektur och projektering AB\",
        \"start-date\": \"2021-12-01\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.205464912164304,
          55.72038332802957
        ]
      },
      \"properties\": {
        \"address\": \"Magistratsvägen 6, 226 43 Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2022-01-28\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20211206-2331\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"Vi skal göra draggropar för att nyttja befintlig kanalisation. \",
        \"applicant\": \"Transtema Network Services\",
        \"start-date\": \"2021-12-09\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.210110446804793,
          55.72082159932404
        ]
      },
      \"properties\": {
        \"address\": \"Magistratsvägen 57, 226 44 Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2022-01-28\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20211206-2332\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"Ta-planen gäller för gropen som är tänkt för skarvning utav fiber i befintlig nergrävd telebrunn.\",
        \"applicant\": \"Transtema Network Services\",
        \"start-date\": \"2021-12-09\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.20196497395781,
          55.72375321841131
        ]
      },
      \"properties\": {
        \"address\": \"Svenshögsvägen 25A, 226 42 Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2022-06-30\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20220117-0126\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"vi ska dränera innergården på skolan\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2022-01-31\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.191240161288533,
          55.703705888536845
        ]
      },
      \"properties\": {
        \"address\": \"Stora Gråbrödersgatan 4, 222 22 Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2023-12-31\",
        \"estimated-effects\": {
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20220209-0315\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"3\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"Generell TA-plan för kortare arbeten\",
        \"applicant\": \"VA Syd\",
        \"start-date\": \"2022-02-09\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.176097786185576,
          55.70573952565131
        ]
      },
      \"properties\": {
        \"address\": \"Steglitsvägen 1, 227 32 Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-08\",
        \"estimated-effects\": {
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Intermittent arbete\",
            \"order\": 99
          }
        },
        \"name\": \"20220309-0567\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Sydvac\",
        \"start-date\": \"2022-03-09\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.235262042644637,
          55.720372545138716
        ]
      },
      \"properties\": {
        \"address\": \"Brunnshögsgatan 40, 224 82 Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2022-04-22\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20220404-0797\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Jonab anläggnings AB\",
        \"start-date\": \"2022-04-20\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.176413702359957,
          55.70351649808377
        ]
      },
      \"properties\": {
        \"address\": \"Trastvägen 1, 227 31 Lund, Sverige\",
        \"worktypes\": [],
        \"end-date\": \"2022-05-13\",
        \"estimated-effects\": {
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20220413-0890\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2022-04-19\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.186253740982998,
          55.68448943195122
        ]
      },
      \"properties\": {
        \"address\": \"Malmövägen 67, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2022-06-22\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20220614-1434\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"RentSafe Sverige AB\",
        \"start-date\": \"2022-06-21\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.234724619582625,
          55.72078680813599
        ]
      },
      \"properties\": {
        \"address\": \"Nobelparken, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20220629-1548\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Kraftringen Nät AB\",
        \"start-date\": \"2022-07-04\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.223005643387213,
          55.68704576786388
        ]
      },
      \"properties\": {
        \"address\": \"Prästavägen 3, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-12-29\",
        \"estimated-effects\": {
          \"3\": {
            \"id\": \"3\",
            \"name\": \"Flera körfält avstängda\",
            \"order\": 3
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20220630-1557\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Jonab anläggnings AB\",
        \"start-date\": \"2022-08-08\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.199168645836194,
          55.696052275397776
        ]
      },
      \"properties\": {
        \"address\": \"Kastanjegatan 17, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-01\",
        \"estimated-effects\": {
          \"4\": {
            \"id\": \"4\",
            \"name\": \"Väg avstängd\",
            \"order\": 4
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20220808-1762\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"PVS Mark & Anläggning AB\",
        \"start-date\": \"2022-08-15\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.1897051,
          55.7227858
        ]
      },
      \"properties\": {
        \"address\": \"Sankt Hans backar\",
        \"worktypes\": [],
        \"end-date\": \"2023-01-15\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20220811-1785\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2022-08-15\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.200654047987873,
          55.69761540022402
        ]
      },
      \"properties\": {
        \"address\": \"Gylleholmsgatan 13Q, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-01\",
        \"estimated-effects\": {
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20220816-1812\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"PVS Mark & Anläggning AB\",
        \"start-date\": \"2022-08-22\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.3402648,
          55.6628729
        ]
      },
      \"properties\": {
        \"address\": \"Malmövägen, Dalby\",
        \"worktypes\": [],
        \"end-date\": \"2022-12-15\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"3\": {
            \"id\": \"3\",
            \"name\": \"Flera körfält avstängda\",
            \"order\": 3
          },
          \"4\": {
            \"id\": \"4\",
            \"name\": \"Väg avstängd\",
            \"order\": 4
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          },
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          }
        },
        \"name\": \"20220826-1931\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2022-09-12\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.209162621076848,
          55.722672511222214
        ]
      },
      \"properties\": {
        \"address\": \"Borgarparken, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-14\",
        \"estimated-effects\": {
          \"park\": {
            \"id\": \"park\",
            \"name\": \"Park\",
            \"order\": 10
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Inget\",
            \"order\": 99
          }
        },
        \"name\": \"20220918-2167\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2022-09-30\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.200868803839535,
          55.697622105132204
        ]
      },
      \"properties\": {
        \"address\": \"Gylleholmsgatan 13O, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          },
          \"parking-lot\": {
            \"id\": \"parking-lot\",
            \"name\": \"Parkering\",
            \"order\": 11
          }
        },
        \"name\": \"20220921-2196\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"PVS Mark & Anläggning AB\",
        \"start-date\": \"2022-10-03\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.192415316431058,
          55.751383334434045
        ]
      },
      \"properties\": {
        \"address\": \"Vallkärravägen 18B, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-12-22\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20220926-2220\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Veidekke Entreprenad AB\",
        \"start-date\": \"2022-10-05\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.20088762659525,
          55.70127755908537
        ]
      },
      \"properties\": {
        \"address\": \"Dalbyvägen 2, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          }
        },
        \"name\": \"20221006-2332\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2022-11-21\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.225204626372355,
          55.69141630506781
        ]
      },
      \"properties\": {
        \"address\": \"Skiffervägen 1A, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-08-16\",
        \"estimated-effects\": {
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20221011-2350\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Jonab anläggnings AB\",
        \"start-date\": \"2022-10-17\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.1943219489554,
          55.69856585934669
        ]
      },
      \"properties\": {
        \"address\": \"Korsgatan 9A, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2022-12-31\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20221017-2394\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Otto Nilssons Byggnads AB\",
        \"start-date\": \"2022-10-24\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.1598786637187,
          55.72135718733138
        ]
      },
      \"properties\": {
        \"address\": \"Dösvägen 36, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2022-11-18\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20221026-2469\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Transtema Network Services\",
        \"start-date\": \"2022-11-17\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.345254028764359,
          55.66079454819298
        ]
      },
      \"properties\": {
        \"address\": \"Verkstadsgatan Dalby\",
        \"worktypes\": [],
        \"end-date\": \"2022-12-12\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20221028-2495\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Transtema Network Services\",
        \"start-date\": \"2022-11-29\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.340915417001304,
          55.725284529631736
        ]
      },
      \"properties\": {
        \"address\": \"Skattebergavägen 3, Södra Sandby\",
        \"worktypes\": [],
        \"end-date\": \"2022-12-30\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20221103-2535\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2022-11-09\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.216786638332243,
          55.715877904465096
        ]
      },
      \"properties\": {
        \"address\": \"Scheelevägen 19, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2022-11-24\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20221109-2568\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Transtema Network Services\",
        \"start-date\": \"2022-11-22\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.217358682877855,
          55.69402257591879
        ]
      },
      \"properties\": {
        \"address\": \"Skiffervägen 20, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"4\": {
            \"id\": \"4\",
            \"name\": \"Väg avstängd\",
            \"order\": 4
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Del av vägbana\",
            \"order\": 1
          },
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20221115-2617\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"3\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lambertsson AB\",
        \"start-date\": \"2022-11-28\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.165988763535923,
          55.72127027977172
        ]
      },
      \"properties\": {
        \"address\": \"Åkergränden, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-03-10\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20221118-2632\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"RentSafe Sverige AB\",
        \"start-date\": \"2022-11-23\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.185096156308921,
          55.708148273178324
        ]
      },
      \"properties\": {
        \"worktypes\": [],
        \"end-date\": \"2023-12-31\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          },
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"uphill\": {
            \"id\": \"uphill\",
            \"name\": \"Motlut\",
            \"order\": 9
          },
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          },
          \"vagren\": {
            \"id\": \"vagren\",
            \"name\": \"Dike/vägren\",
            \"order\": 3
          },
          \"square\": {
            \"id\": \"square\",
            \"name\": \"Torgyta\",
            \"order\": 12
          },
          \"parking-lot\": {
            \"id\": \"parking-lot\",
            \"name\": \"Parkering\",
            \"order\": 11
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"park\": {
            \"id\": \"park\",
            \"name\": \"Park\",
            \"order\": 10
          }
        },
        \"name\": \"20221123-2648\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Anticimex AB\",
        \"start-date\": \"2023-01-01\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.23041514155943,
          55.77614272944567
        ]
      },
      \"properties\": {
        \"address\": \"Nybyggesvägen 4, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-05-31\",
        \"estimated-effects\": {
          \"4\": {
            \"id\": \"4\",
            \"name\": \"Väg avstängd\",
            \"order\": 4
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20221128-2663\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Veidekke Entreprenad AB\",
        \"start-date\": \"2022-12-12\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.1950163963625,
          55.712170238173144
        ]
      },
      \"properties\": {
        \"address\": \"Barngatan 2, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-12-10\",
        \"estimated-effects\": {
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat  Spårvägen\",
            \"order\": 99
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"parking-lot\": {
            \"id\": \"parking-lot\",
            \"name\": \"Parkering\",
            \"order\": 11
          },
          \"park\": {
            \"id\": \"park\",
            \"name\": \"Park\",
            \"order\": 10
          }
        },
        \"name\": \"20221128-2668\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Infranord\",
        \"start-date\": \"2022-12-11\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.19301010401936,
          55.70935358797673
        ]
      },
      \"properties\": {
        \"address\": \"Bredgatan 20, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-12-10\",
        \"estimated-effects\": {
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat  Spårvägen\",
            \"order\": 99
          },
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"parking-lot\": {
            \"id\": \"parking-lot\",
            \"name\": \"Parkering\",
            \"order\": 11
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20221128-2669\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Infranord\",
        \"start-date\": \"2022-12-11\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.203642380554394,
          55.71311487909027
        ]
      },
      \"properties\": {
        \"address\": \"Baravägen 30, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-09-24\",
        \"estimated-effects\": {
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat  Spårvägen\",
            \"order\": 99
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"park\": {
            \"id\": \"park\",
            \"name\": \"Park\",
            \"order\": 10
          },
          \"parking-lot\": {
            \"id\": \"parking-lot\",
            \"name\": \"Parkering\",
            \"order\": 11
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20221128-2670\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Infranord\",
        \"start-date\": \"2023-05-07\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.209822190124706,
          55.71429947527005
        ]
      },
      \"properties\": {
        \"address\": \"Sölvegatan 39, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-12-10\",
        \"estimated-effects\": {
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat  Spårvägen\",
            \"order\": 99
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"park\": {
            \"id\": \"park\",
            \"name\": \"Park\",
            \"order\": 10
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"parking-lot\": {
            \"id\": \"parking-lot\",
            \"name\": \"Parkering\",
            \"order\": 11
          }
        },
        \"name\": \"20221128-2671\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Infranord\",
        \"start-date\": \"2022-12-11\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.188982400663765,
          55.70753466276865
        ]
      },
      \"properties\": {
        \"address\": \"Clemenstorget 8, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-12-10\",
        \"estimated-effects\": {
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat  Spårvägen\",
            \"order\": 99
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"park\": {
            \"id\": \"park\",
            \"name\": \"Park\",
            \"order\": 10
          },
          \"parking-lot\": {
            \"id\": \"parking-lot\",
            \"name\": \"Parkering\",
            \"order\": 11
          }
        },
        \"name\": \"20221128-2673\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Infranord\",
        \"start-date\": \"2022-12-11\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.188692722090156,
          55.7073714524766
        ]
      },
      \"properties\": {
        \"address\": \"Clemenstorget 8, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-12-10\",
        \"estimated-effects\": {
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat  Spårvägen\",
            \"order\": 99
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"park\": {
            \"id\": \"park\",
            \"name\": \"Park\",
            \"order\": 10
          },
          \"parking-lot\": {
            \"id\": \"parking-lot\",
            \"name\": \"Parkering\",
            \"order\": 11
          }
        },
        \"name\": \"20221128-2675\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Infranord\",
        \"start-date\": \"2022-12-11\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.23119403396932,
          55.716536242961055
        ]
      },
      \"properties\": {
        \"address\": \"Brunnshögsgatan 11, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-12-10\",
        \"estimated-effects\": {
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat  Spårvägen\",
            \"order\": 99
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"park\": {
            \"id\": \"park\",
            \"name\": \"Park\",
            \"order\": 10
          },
          \"parking-lot\": {
            \"id\": \"parking-lot\",
            \"name\": \"Parkering\",
            \"order\": 11
          }
        },
        \"name\": \"20221128-2677\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Infranord\",
        \"start-date\": \"2022-12-11\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.1883097187398,
          55.70718394650865
        ]
      },
      \"properties\": {
        \"address\": \"Clemenstorget 3, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-12-13\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Ingen\",
            \"order\": 99
          },
          \"square\": {
            \"id\": \"square\",
            \"name\": \"Torgyta\",
            \"order\": 12
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20221130-2697\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Tekniska förvaltningen\",
        \"start-date\": \"2022-12-13\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.24326229819615,
          55.729733797672715
        ]
      },
      \"properties\": {
        \"address\": \"Odarslövsvägen 98, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2024-08-01\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20221202-2707\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Skanska Sverige AB\",
        \"start-date\": \"2022-12-16\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.17595455459423,
          55.723358701165814
        ]
      },
      \"properties\": {
        \"address\": \"Nöbbelövsvägen, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-05-26\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"GC banor avstängda\",
            \"order\": 99
          }
        },
        \"name\": \"20221212-2733\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2023-01-09\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.208000889803747,
          55.717190498146245
        ]
      },
      \"properties\": {
        \"address\": \"Getingevägen 62, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2024-06-30\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20221220-2788\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Innovation Skåne AB\",
        \"start-date\": \"2023-01-12\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.176769186304197,
          55.74005233715879
        ]
      },
      \"properties\": {
        \"address\": \"Liggaregränden 6, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-10\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20221228-2830\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Cablequick AB\",
        \"start-date\": \"2023-03-13\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.196306134170852,
          55.68792699207252
        ]
      },
      \"properties\": {
        \"address\": \"Landerigränden 15, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-01-17\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230102-0003\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Transtema Network Services\",
        \"start-date\": \"2023-01-03\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.17599366442792,
          55.72368587706682
        ]
      },
      \"properties\": {
        \"address\": \"Nöbbelövsvägen 12, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-28\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"GC-väg avstängd\",
            \"order\": 99
          }
        },
        \"name\": \"20230103-0007\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2023-01-23\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.241939549900174,
          55.694134164559664
        ]
      },
      \"properties\": {
        \"address\": \"Iduns Plats 3, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-01-23\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20230104-0014\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2023-01-09\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.174049746963004,
          55.72671950173448
        ]
      },
      \"properties\": {
        \"address\": \"Jaktstigen 83, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-05-26\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"GC-bana\",
            \"order\": 99
          }
        },
        \"name\": \"20230104-0018\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2023-03-09\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.229376556802475,
          55.69260600907944
        ]
      },
      \"properties\": {
        \"address\": \"Sandstensvägen, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-05-31\",
        \"estimated-effects\": {
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230110-0039\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Tekniska förvaltningen\",
        \"start-date\": \"2023-01-11\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.191253596369469,
          55.750024793934976
        ]
      },
      \"properties\": {
        \"address\": \"Soldat Skalks gata 26, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230113-0080\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2023-01-23\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.182504125396934,
          55.68855311986261
        ]
      },
      \"properties\": {
        \"address\": \"Sankt Lars väg, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-17\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230116-0098\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Wästbygg AB\",
        \"start-date\": \"2023-01-17\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.196660415539494,
          55.70159406903966
        ]
      },
      \"properties\": {
        \"address\": \"Mårtenstorget 10, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-05-01\",
        \"estimated-effects\": {
          \"6\": {
            \"id\": \"6\",
            \"name\": \"Påfart avstängd\",
            \"order\": 6
          },
          \"7\": {
            \"id\": \"7\",
            \"name\": \"Avfart avstängd\",
            \"order\": 7
          },
          \"square\": {
            \"id\": \"square\",
            \"name\": \"Torgyta\",
            \"order\": 12
          },
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          },
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          }
        },
        \"name\": \"20230124-0156\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"3\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Tekniska förvaltningen\",
        \"start-date\": \"2023-03-06\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.214009128830408,
          55.69769318536538
        ]
      },
      \"properties\": {
        \"address\": \"Generell TA plan minder beläggningsarbete\",
        \"worktypes\": [],
        \"end-date\": \"2024-12-31\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230126-0181\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Svevia AB\",
        \"start-date\": \"2023-01-26\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.20088130314057,
          55.69580694098601
        ]
      },
      \"properties\": {
        \"address\": \"Södra Vägen, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230203-0260\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.198255947010876,
          55.751352784306
        ]
      },
      \"properties\": {
        \"address\": \"Vallkärravägen, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-17\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230206-0265\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Veidekke Entreprenad AB\",
        \"start-date\": \"2023-02-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.173488605212498,
          55.696505534825455
        ]
      },
      \"properties\": {
        \"address\": \"Maskinvägen 1, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230208-0290\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"3\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Transtema Network Services\",
        \"start-date\": \"2023-03-20\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.191200188112093,
          55.74874837850227
        ]
      },
      \"properties\": {
        \"address\": \"Kalasgränden 1, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-28\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230213-0325\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"3\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Jonab anläggnings AB\",
        \"start-date\": \"2023-03-15\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.188054067520486,
          55.69484732290373
        ]
      },
      \"properties\": {
        \"address\": \"Ringvägen, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-05-10\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20230217-0365\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2023-03-20\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.195069515381842,
          55.7183146065144
        ]
      },
      \"properties\": {
        \"address\": \"Margaretavägen 2, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-29\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230217-0375\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Cablequick AB\",
        \"start-date\": \"2023-02-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.354927791111932,
          55.66903905834492
        ]
      },
      \"properties\": {
        \"address\": \"Backvägen, Dalby, Sweden\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-14\",
        \"estimated-effects\": {
          \"4\": {
            \"id\": \"4\",
            \"name\": \"Väg avstängd\",
            \"order\": 4
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20230220-0381\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Antonssons Mark & Entreprenad AB\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.199069779697318,
          55.696191442422
        ]
      },
      \"properties\": {
        \"address\": \"Kastanjegatan 15, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-07\",
        \"estimated-effects\": {
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230227-0454\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"PVS Mark& Anläggning AB\",
        \"start-date\": \"2023-03-13\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.244141407773045,
          55.70260060828075
        ]
      },
      \"properties\": {
        \"address\": \"Fylkingavägen\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-07\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230228-0476\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"VA Syd\",
        \"start-date\": \"2023-03-20\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.21665135023044,
          55.695922717860256
        ]
      },
      \"properties\": {
        \"address\": \"Skiffervägen 24, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-06-16\",
        \"estimated-effects\": {
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230228-0486\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"NCC Sverige AB\",
        \"start-date\": \"2023-03-13\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.19731680109844,
          55.70605294666707
        ]
      },
      \"properties\": {
        \"address\": \"Tomegapsgatan 10, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-21\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          }
        },
        \"name\": \"20230301-0492\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Thage i Skåne AB\",
        \"start-date\": \"2023-03-20\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.18939612031642,
          55.68331674973305
        ]
      },
      \"properties\": {
        \"address\": \"Torsvägen, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-03-27\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230301-0507\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"VA Syd\",
        \"start-date\": \"2023-03-13\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.393819111695402,
          55.59384178301386
        ]
      },
      \"properties\": {
        \"address\": \"Hjortstigen, Genarp\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-03\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230302-0522\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"VA Syd\",
        \"start-date\": \"2023-03-20\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.20477809795256,
          55.71502426020442
        ]
      },
      \"properties\": {
        \"address\": \"Onsjögatan, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-19\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230303-0526\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2023-03-13\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.187707240642629,
          55.717223827395074
        ]
      },
      \"properties\": {
        \"address\": \"Baravägen, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-03-29\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230307-0555\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Lunds kommun - Markentreprenad\",
        \"start-date\": \"2023-03-15\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.510139277805585,
          55.62871878819511
        ]
      },
      \"properties\": {
        \"address\": \"Utåkersvägen 3, Veberöd\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-07\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230308-0575\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Jonab anläggnings AB\",
        \"start-date\": \"2023-03-15\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.392568854899789,
          55.60024363653797
        ]
      },
      \"properties\": {
        \"address\": \"Hasslebackavägen, Genarp\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-13\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230308-0582\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"VA Syd\",
        \"start-date\": \"2023-03-22\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.176074098760875,
          55.72338396815692
        ]
      },
      \"properties\": {
        \"address\": \"Nöbbelövsvägen\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-21\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20230309-0595\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"RentSafe Sverige AB\",
        \"start-date\": \"2023-03-20\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.394605304879716,
          55.600139031070476
        ]
      },
      \"properties\": {
        \"address\": \"Bankerudsgatan, Genarp\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-10\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230315-0634\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"VA Syd\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.206269078221009,
          55.71039068747248
        ]
      },
      \"properties\": {
        \"address\": \"Tornavägen\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-03-24\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230315-0666\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"3\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"VA Syd\",
        \"start-date\": \"2023-03-14\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.207606213264937,
          55.72738975645689
        ]
      },
      \"properties\": {
        \"address\": \"Vitnessgränden\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-13\",
        \"estimated-effects\": {
          \"2\": {
            \"id\": \"2\",
            \"name\": \"Ett körfält avstängt\",
            \"order\": 2
          },
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20230317-0684\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"RD Entreprenad AB\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.201609462952977,
          55.69753673244083
        ]
      },
      \"properties\": {
        \"address\": \"Gylleholmsgatan 15, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-07\",
        \"estimated-effects\": {
          \"1\": {
            \"id\": \"1\",
            \"name\": \"Smalare körfält\",
            \"order\": 1
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 99
          }
        },
        \"name\": \"20230321-0700\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"2\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Jönssons Sydgräv i Trelleborg AB\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.23096918220607,
          55.69520971498784
        ]
      },
      \"properties\": {
        \"address\": \"Björn Järnsidas gränd 12, Lund\",
        \"worktypes\": [],
        \"end-date\": \"2023-04-14\",
        \"estimated-effects\": {
          \"4\": {
            \"id\": \"4\",
            \"name\": \"Väg avstängd\",
            \"order\": 4
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230321-0723\",
        \"type\": \"ta\",
        \"estimated-traffic-effect\": \"none\",
        \"status\": \"Ärende - Pågående\",
        \"link\": \"\",
        \"comment\": \"\",
        \"applicant\": \"Jonab Anläggning\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.19029065929727,
          55.72343008907952
        ]
      },
      \"properties\": {
        \"address\": \"Skyttelinjen 89, 226 49 Lund, Sverige\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2022-12-31\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20210924-1797\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2022-03-21\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.193647702186423,
          55.753709859151414
        ]
      },
      \"properties\": {
        \"address\": \"Vallkärravägen 16c, 226 51 Lund, Sverige\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2024-03-01\",
        \"estimated-effects\": {
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 1
          }
        },
        \"name\": \"20211028-2046\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"lund.se/stadsutveckling-och-trafik/trafik--och-byggprojekt/stangby-vaster-ii-etapp-2\",
        \"comment\": \"Byggnation/exploatering av stadsdelspark, byggator etapp 2 och VA-arbeten. Arbetsområdet indelat i 3 områden, kring Vallkärravägen - Stångby Allé - Drabantvägen.\",
        \"start-date\": \"2022-04-04\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.1997198680864,
          55.69705456639903
        ]
      },
      \"properties\": {
        \"address\": \"Kastanjegatan 13, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          },
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2029-12-31\",
        \"estimated-effects\": {
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20211118-2227\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"Tekniskas projekt Råbykungen. Del1: markförberedelse på kvartersmark 2022-2023 Del 2: bostadsbyggnation 2023-2028 Del 3: Färdigställande -2029\",
        \"start-date\": \"2022-05-01\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.493919270576686,
          55.62533539372973
        ]
      },
      \"properties\": {
        \"address\": \"Veberöd \",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-09-29\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"vagren\": {
            \"id\": \"vagren\",
            \"name\": \"Dike/vägren\",
            \"order\": 3
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 1
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20220614-1426\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2022-09-01\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.234782484789571,
          55.72072602517836
        ]
      },
      \"properties\": {
        \"address\": \"Brunnshögsgatan 40, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-05-31\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"park\": {
            \"id\": \"park\",
            \"name\": \"Park\",
            \"order\": 10
          }
        },
        \"name\": \"20220708-1617\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2022-07-11\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.5014624579156,
          55.64153331528142
        ]
      },
      \"properties\": {
        \"address\": \"Lastvägen 4, Veberöd\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-09-30\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"vagren\": {
            \"id\": \"vagren\",
            \"name\": \"Dike/vägren\",
            \"order\": 3
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 1
          }
        },
        \"name\": \"20220711-1624\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-05-02\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.191774996176639,
          55.74894723065912
        ]
      },
      \"properties\": {
        \"address\": \"20, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-09-29\",
        \"estimated-effects\": {
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20220823-1885\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.524831578620113,
          55.62988253440702
        ]
      },
      \"properties\": {
        \"address\": \"LJUNGEN 511, Veberöd\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-08-31\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"vagren\": {
            \"id\": \"vagren\",
            \"name\": \"Dike/vägren\",
            \"order\": 3
          },
          \"parking-lot\": {
            \"id\": \"parking-lot\",
            \"name\": \"Parkering\",
            \"order\": 11
          }
        },
        \"name\": \"20220830-1958\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.53529087331002,
          55.636846474879405
        ]
      },
      \"properties\": {
        \"address\": \"247 96 Veberöd\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-09-15\",
        \"estimated-effects\": {
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20220830-1959\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.531085584124861,
          55.63500575934915
        ]
      },
      \"properties\": {
        \"address\": \"LJUNGEN 491, Veberöd\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-08-31\",
        \"estimated-effects\": [],
        \"name\": \"20220909-2081\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.167445484622998,
          55.70096136645066
        ]
      },
      \"properties\": {
        \"address\": \"Plåtslagarevägen 8, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-05-15\",
        \"estimated-effects\": {
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          }
        },
        \"name\": \"20220915-2140\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-31\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.516410878440807,
          55.629603019765575
        ]
      },
      \"properties\": {
        \"address\": \"HASSLEMÖLLA 631, Veberöd\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-08-31\",
        \"estimated-effects\": {
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20221006-2326\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.51633277402863,
          55.62960081595153
        ]
      },
      \"properties\": {
        \"address\": \"HASSLEMÖLLA 631, Veberöd\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-08-31\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"vagren\": {
            \"id\": \"vagren\",
            \"name\": \"Dike/vägren\",
            \"order\": 3
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20221006-2327\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.402282158219577,
          55.604493275827195
        ]
      },
      \"properties\": {
        \"address\": \"Anders Larssons väg 10, Genarp\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-05-03\",
        \"estimated-effects\": {
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          },
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"park\": {
            \"id\": \"park\",
            \"name\": \"Park\",
            \"order\": 10
          }
        },
        \"name\": \"20221212-2731\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-04-03\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.492710666362298,
          55.62991951875275
        ]
      },
      \"properties\": {
        \"address\": \"Kastanjegatan 3, Veberöd\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-05-31\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230112-0072\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-05-01\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.350719027357702,
          55.66076179953308
        ]
      },
      \"properties\": {
        \"address\": \"Elverksvägen 9, Dalby\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-28\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          }
        },
        \"name\": \"20230206-0262\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-02-13\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.203356879151276,
          55.71160935323451
        ]
      },
      \"properties\": {
        \"address\": \"Sölvegatan 19, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-30\",
        \"estimated-effects\": {
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          }
        },
        \"name\": \"20230216-0344\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-31\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.234292718152684,
          55.72069658276418
        ]
      },
      \"properties\": {
        \"address\": \"Upptäcktsgatan\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-05-05\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230224-0425\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-04-24\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.1779447,
          55.7272345
        ]
      },
      \"properties\": {
        \"address\": \"Jaktstigen, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-03-24\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230227-0457\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-17\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.244141407773045,
          55.70260060828075
        ]
      },
      \"properties\": {
        \"address\": \"Nordmannavägen 120, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-07\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20230227-0460\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-20\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.195596375891062,
          55.70435855801733
        ]
      },
      \"properties\": {
        \"address\": \"Tegnérsplatsen 4, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-08-31\",
        \"estimated-effects\": {
          \"parking-lot\": {
            \"id\": \"parking-lot\",
            \"name\": \"Parkering\",
            \"order\": 11
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230302-0520\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-06-01\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.240631396198612,
          55.73435565884754
        ]
      },
      \"properties\": {
        \"address\": \"Fotongatan, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-05-31\",
        \"estimated-effects\": {
          \"other\": {
            \"id\": \"other\",
            \"name\": \"Annat\",
            \"order\": 1
          }
        },
        \"name\": \"20230306-0538\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-04-03\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.207606213264937,
          55.72738975645689
        ]
      },
      \"properties\": {
        \"address\": \"Vittnesgränden 51, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-05-31\",
        \"estimated-effects\": {
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20230306-0539\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-04-03\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.192030727764186,
          55.700594727074375
        ]
      },
      \"properties\": {
        \"address\": \"Stora Södergatan 21, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-21\",
        \"estimated-effects\": {
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          }
        },
        \"name\": \"20230306-0540\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-04-03\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.186579814435717,
          55.71616738865358
        ]
      },
      \"properties\": {
        \"address\": \"Narvavägen 1, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-06-02\",
        \"estimated-effects\": {
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          }
        },
        \"name\": \"20230306-0545\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-05-02\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.223488343857008,
          55.71014054242947
        ]
      },
      \"properties\": {
        \"address\": \"Östratornsvägen 1B, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-30\",
        \"estimated-effects\": {
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230306-0547\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.229013712303148,
          55.69106380695995
        ]
      },
      \"properties\": {
        \"address\": \"Råbylundsvägen 87, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-03-24\",
        \"estimated-effects\": {
          \"vagren\": {
            \"id\": \"vagren\",
            \"name\": \"Dike/vägren\",
            \"order\": 3
          }
        },
        \"name\": \"20230307-0570\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-17\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.21928172199604,
          55.704520155780195
        ]
      },
      \"properties\": {
        \"address\": \"G W Palms väg 4, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          },
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-09-08\",
        \"estimated-effects\": {
          \"park\": {
            \"id\": \"park\",
            \"name\": \"Park\",
            \"order\": 10
          },
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20230307-0574\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-05-01\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.205077198880785,
          55.6982708523468
        ]
      },
      \"properties\": {
        \"address\": \"Ulrikedalsvägen 8A, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-03-31\",
        \"estimated-effects\": {
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          }
        },
        \"name\": \"20230309-0591\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-24\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.16235297432998,
          55.707185653945416
        ]
      },
      \"properties\": {
        \"address\": \"Gråsparvsvägen 5, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-12-22\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20230310-0607\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-04-03\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.165153200541528,
          55.70714333985349
        ]
      },
      \"properties\": {
        \"address\": \"Ejdervägen 1M, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-12-29\",
        \"estimated-effects\": {
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          }
        },
        \"name\": \"20230310-0609\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-07-31\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.190566261671073,
          55.703237027696495
        ]
      },
      \"properties\": {
        \"address\": \"Lilla Fiskaregatan 8B, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-28\",
        \"estimated-effects\": {
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          }
        },
        \"name\": \"20230313-0615\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-04-03\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.178130460000602,
          55.699713674338746
        ]
      },
      \"properties\": {
        \"address\": \"Kakelvägen 2A, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-14\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230313-0621\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-31\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.18870344456942,
          55.71151601628463
        ]
      },
      \"properties\": {
        \"address\": \"Karl XI gatan 25, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-14\",
        \"estimated-effects\": {
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          }
        },
        \"name\": \"20230313-0622\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-30\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.239031311569978,
          55.71055134801569
        ]
      },
      \"properties\": {
        \"address\": \"Flygelvägen, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-10\",
        \"estimated-effects\": {
          \"cvag\": {
            \"id\": \"cvag\",
            \"name\": \"Cykelväg\",
            \"order\": 2
          }
        },
        \"name\": \"20230315-0641\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.162240809053793,
          55.70589123353272
        ]
      },
      \"properties\": {
        \"address\": \"Tage Erlanders väg 10, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-14\",
        \"estimated-effects\": {
          \"vagren\": {
            \"id\": \"vagren\",
            \"name\": \"Dike/vägren\",
            \"order\": 3
          }
        },
        \"name\": \"20230315-0644\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.191823886508182,
          55.69936606464226
        ]
      },
      \"properties\": {
        \"address\": \"Stora Tvärgatan 1 C, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-14\",
        \"estimated-effects\": {
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230315-0651\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.359669697483815,
          55.667132725753426
        ]
      },
      \"properties\": {
        \"address\": \"Långgatan 44, Dalby\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-27\",
        \"estimated-effects\": {
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230315-0663\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.229988386348142,
          55.71780329181244
        ]
      },
      \"properties\": {
        \"address\": \"Telefongatan 14, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-12\",
        \"estimated-effects\": {
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230316-0670\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-29\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.183175527284021,
          55.6933610460381
        ]
      },
      \"properties\": {
        \"address\": \"Östanväg 3, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-20\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20230320-0689\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-04-05\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.363524839497195,
          55.71751305673647
        ]
      },
      \"properties\": {
        \"address\": \"Öståkravägen 1, Södra Sandby\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-21\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20230321-0721\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-24\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.35819143802869,
          55.7155048411829
        ]
      },
      \"properties\": {
        \"address\": \"Östervång 10, Södra Sandby\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-21\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20230321-0725\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-24\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.362101096928196,
          55.71771517276342
        ]
      },
      \"properties\": {
        \"address\": \"Öståkravägen 15, Södra Sandby\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-21\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20230321-0726\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-24\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.221151994327846,
          55.70389095664498
        ]
      },
      \"properties\": {
        \"address\": \"Vipeholms Allé 11, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-28\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230322-0729\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-30\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.243554626623654,
          55.70205936304393
        ]
      },
      \"properties\": {
        \"address\": \"Angantyrs gränd 6, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-21\",
        \"estimated-effects\": {
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20230322-0731\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-24\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.239179426092145,
          55.70420390260921
        ]
      },
      \"properties\": {
        \"address\": \"Mårtenslovsvägen 25, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-21\",
        \"estimated-effects\": {
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20230322-0734\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-24\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.212398462517804,
          55.70783062800321
        ]
      },
      \"properties\": {
        \"address\": \"Warholms väg 5, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-04-17\",
        \"estimated-effects\": {
          \"gvag\": {
            \"id\": \"gvag\",
            \"name\": \"Gångväg\",
            \"order\": 6
          },
          \"halv-vb\": {
            \"id\": \"halv-vb\",
            \"name\": \"Halva vägbanan\",
            \"order\": 7
          }
        },
        \"name\": \"20230323-0741\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-04-03\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.226361082614003,
          55.72254092424584
        ]
      },
      \"properties\": {
        \"address\": \"Brunnshögsvägen 30, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-05-05\",
        \"estimated-effects\": {
          \"vagren\": {
            \"id\": \"vagren\",
            \"name\": \"Dike/vägren\",
            \"order\": 3
          }
        },
        \"name\": \"20230323-0751\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-04-17\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.490848531534123,
          55.633193095577155
        ]
      },
      \"properties\": {
        \"address\": \"Gamla vägen 9, Veberöd\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-03-29\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"trottoar\": {
            \"id\": \"trottoar\",
            \"name\": \"Trottoar\",
            \"order\": 13
          }
        },
        \"name\": \"20230324-0759\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-27\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.186953522253049,
          55.71044873581582
        ]
      },
      \"properties\": {
        \"address\": \"Karl XII gatan 20, Lund\",
        \"worktypes\": {
          \"rep\": {
            \"id\": \"rep\",
            \"name\": \"Reparation/Underhåll\",
            \"order\": 10
          }
        },
        \"end-date\": \"2023-05-26\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"parking-lot\": {
            \"id\": \"parking-lot\",
            \"name\": \"Parkering\",
            \"order\": 11
          }
        },
        \"name\": \"20230324-0761\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-04-24\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.174890902253743,
          55.728937853932585
        ]
      },
      \"properties\": {
        \"address\": \"Jägaregatan 76, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-28\",
        \"estimated-effects\": {
          \"hel-vb\": {
            \"id\": \"hel-vb\",
            \"name\": \"Hela vägbanan\",
            \"order\": 8
          },
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          },
          \"green-area\": {
            \"id\": \"green-area\",
            \"name\": \"Grönområde\",
            \"order\": 5
          }
        },
        \"name\": \"20230324-0764\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-03-30\"
      }
    },
    {
      \"type\": \"Feature\",
      \"geometry\": {
        \"type\": \"Point\",
        \"coordinates\": [
          13.209222523322651,
          55.698629040338616
        ]
      },
      \"properties\": {
        \"address\": \"Merkuriusgatan 10, Lund\",
        \"worktypes\": {
          \"nyanl\": {
            \"id\": \"nyanl\",
            \"name\": \"Nyanläggning\",
            \"order\": 9
          }
        },
        \"end-date\": \"2023-04-07\",
        \"estimated-effects\": {
          \"gc-road\": {
            \"id\": \"gc-road\",
            \"name\": \"GC-väg\",
            \"order\": 4
          }
        },
        \"name\": \"20230325-0768\",
        \"type\": \"gr\",
        \"status\": \"Ärende - Nytt\",
        \"link\": \"\",
        \"comment\": \"\",
        \"start-date\": \"2023-04-03\"
      }
    }
  ]
}")

(def my-data (.parse js/JSON json-input))

