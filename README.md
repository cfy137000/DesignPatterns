# DesignPatterns
面向对象的23种设计模式

##面向对象
话说三国时期，曹操带领百万大军攻打东吴，大军在长江赤壁驻扎，军船连成一片，眼看就要灭掉东吴，统一天下，曹操大悦，于是大宴众文武，在酒席间，曹操诗性大发，不觉吟道：“喝酒唱歌，人生真爽。…………”。众文武齐呼：“丞相好诗！”于是一臣子速命印刷工匠刻版印刷，以便流传天下。样张出来给曹操一看，曹操感觉不妥，说道：“喝与唱，此话过俗，应改为‘对酒当歌’较好！”，于是此臣就命工匠重新来过。工匠眼看连夜刻版之工，彻底白费，心中叫苦不喋。只得照办。样张再次出来请曹操过目，曹操细细一品，觉得还是不好，说：“人生真爽太过直接，应改问语才够意境，因此应改为‘对酒当歌，人生几何？…………’！”当臣转告工匠之时，工匠晕倒…………！可惜三国时期活字印刷还未发明，所以类似事情应该时有发生，如果是有了活字印刷。则只需更改四个字就可，其余工作都未白做。实在妙哉。
###例子总结
- 第一，要改，只需更改要改之字，此为可维护；
- 第二，这些字并非用完这次就无用，完全可以在后来的印刷中重复使用，此乃可复用；
- 第三，此诗若要加字，只需另刻字加入即可，这是可扩展；
- 第四，字的排列其实有可能是竖有可能是横排，此时只需将活字移动就可做到满足排列需求，此是灵活性好。
而在活字印刷术之前，上面的四种特性都无法满足，要修改，必须重刻，要加字，必须重刻，要重新排列，必须重刻，印完这本书后，此版已无任何可再利用价值。

------------------
##代码
- [简单工厂模式](https://github.com/cfy137000/DesignPatterns/tree/master/%E7%AE%80%E5%8D%95%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F)
