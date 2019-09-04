package com.springfans.itard.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Itard
 * @date 2019/9/2 15:15
 */
public class WebSite {
    public static void main(String[] args) {
        String domain = "www.coingame.cc\twww.coingame.one\twww.888000.in\twww.coingame01.com\twww.coingame02.com\twww.coingame03.com\twww.coingame04.com\twww.coingame05.com\twww.coingame158.com\n" +
                "sso.coingame.cc\tsso.coingame.one\tsso.888000.in\tsso.coingame01.com\tsso.coingame02.com\tsso.coingame03.com\tsso.coingame04.com\tsso.coingame05.com\tsso.coingame158.com\n" +
                "static.czsjnzx.com\tstatic.mayiejia.com\tstatic.ksthotel.com\tstatic.jjxh120.com\tstatic.xianhaotian.com\tstatic.chenghaigou.com\tstatic.duocaizhengxin.com\tstatic.vxiaoke.com\tstatic.whjiapei.com\n" +
                "api.czsjnzx.com\tapi.mayiejia.com\tapi.ksthotel.com\tapi.jjxh120.com\tapi.xianhaotian.com\tapi.chenghaigou.com\tapi.duocaizhengxin.com\tapi.vxiaoke.com\tapi.whjiapei.com\n" +
                "events.czsjnzx.com\tevents.mayiejia.com\tevents.ksthotel.com\tevents.jjxh120.com\tevents.xianhaotian.com\tevents.chenghaigou.com\tevents.duocaizhengxin.com\tevents.vxiaoke.com\tevents.whjiapei.com\n" +
                "www.czsjnzx.com\twww.mayiejia.com\twww.ksthotel.com\twww.jjxh120.com\twww.xianhaotian.com\twww.chenghaigou.com\twww.duocaizhengxin.com\twww.vxiaoke.com\twww.whjiapei.com\nrocket.888000.in\trocket.coingame.cc\trocket.coingame.one\trocket.coingame01.com\trocket.coingame02.com\trocket.coingame03.com\trocket.coingame04.com\trocket.coingame05.com\trocket.cslongteng.com\trocket.zjc178.com\trocket.jindingxinfang.com\trocket.coingame158.com\n" +
                "rocket.ksthotel.com\trocket.czsjnzx.com\tprod-rockets.oss-cn-shanghai.aliyuncs.com\tprod-rockets.oss-cn-shanghai.aliyuncs.com\trocket.xianhaotian.com\trocket.chenghaigou.com\tprod-rockets.oss-cn-shanghai.aliyuncs.com\trocket.vxiaoke.com\trocket.52hotpot.com\tprod-rocket.oss-cn-shanghai.aliyuncs.com\tprod-rockets.oss-cn-shanghai.aliyuncs.com\tprod-rocket.oss-cn-shanghai.aliyuncs.com\n" +
                "rocket-api.ksthotel.com\trocket-api.czsjnzx.com\trocket-api.mayiejia.com\trocket-api.jjxh120.com\trocket-api.xianhaotian.com\trocket-api.chenghaigou.com\trocket-api.duocaizhengxin.com\trocket-api.vxiaoke.com\trocket-api.52hotpot.com\trocket-api.hnjungle.com\trocket-api.ybdxshop.com\trocket-api.whjiapei.com\n" +
                "median.888000.in\tmedian.coingame.cc\tmedian.coingame.one\tmedian.coingame01.com\tmedian.coingame02.com\tmedian.coingame03.com\tmedian.coingame04.com\tmedian.coingame05.com\tmedian.cslongteng.com\tmedian.zjc178.com\tmedian.jindingxinfang.com\tmedian.coingame158.com\n" +
                "median.ksthotel.com\tmedian.czsjnzx.com\tprod-median.oss-cn-shanghai.aliyuncs.com\tprod-median.oss-cn-shanghai.aliyuncs.com\tmedian.xianhaotian.com\tmedian.chenghaigou.com\tprod-median.oss-cn-shanghai.aliyuncs.com\tmedian.vxiaoke.com\tmedian.52hotpot.com\tprod-median.oss-cn-shanghai.aliyuncs.com\tprod-median.oss-cn-shanghai.aliyuncs.com\tprod-median.oss-cn-shanghai.aliyuncs.com\n" +
                "median-api.ksthotel.com\tmedian-api.czsjnzx.com\tmedian-api.mayiejia.com\tmedian-api.jjxh120.com\tmedian-api.xianhaotian.com\tmedian-api.chenghaigou.com\tmedian-api.duocaizhengxin.com\tmedian-api.vxiaoke.com\tmedian-api.52hotpot.com\tmedian-api.hnjungle.com\tmedian-api.ybdxshop.com\tmedian-api.whjiapei.com\n" +
                "magnate.888000.in\tmagnate.coingame.cc\tmagnate.coingame.one\tmagnate.coingame01.com\tmagnate.coingame02.com\tmagnate.coingame03.com\tmagnate.coingame04.com\tmagnate.coingame05.com\tmagnate.cslongteng.com\tmagnate.zjc178.com\tmagnate.jindingxinfang.com\tmagnate.coingame158.com\n" +
                "magnate.ksthotel.com\tmagnate.czsjnzx.com\tprod-magnate.oss-cn-shanghai.aliyuncs.com\tprod-magnate.oss-cn-shanghai.aliyuncs.com\tmagnate.xianhaotian.com\tmagnate.chenghaigou.com\tprod-magnate.oss-cn-shanghai.aliyuncs.com\tmagnate.vxiaoke.com\tmagnate.52hotpot.com\tprod-magnate.oss-cn-shanghai.aliyuncs.com\tprod-magnate.oss-cn-shanghai.aliyuncs.com\tprod-magnate.oss-cn-shanghai.aliyuncs.com\n" +
                "magnate-api.ksthotel.com\tmagnate-api.czsjnzx.com\tmagnate-api.mayiejia.com\tmagnate-api.jjxh120.com\tmagnate-api.xianhaotian.com\tmagnate-api.chenghaigou.com\tmagnate-api.duocaizhengxin.com\tmagnate-api.vxiaoke.com\tmagnate-api.52hotpot.com\tmagnate-api.hnjungle.com\tmagnate-api.ybdxshop.com\tmagnate-api.whjiapei.com\n" +
                "mining.888000.in\tmining.coingame.cc\tmining.coingame.one\tmining.coingame01.com\tmining.coingame02.com\tmining.coingame03.com\tmining.coingame04.com\tmining.coingame05.com\tmining.cslongteng.com\tmining.zjc178.com\tmining.jindingxinfang.com\tmining.coingame158.com\n" +
                "mining.ksthotel.com\tmining.czsjnzx.com\tprod-mining.oss-cn-shanghai.aliyuncs.com\tprod-mining.oss-cn-shanghai.aliyuncs.com\tmining.xianhaotian.com\tmining.chenghaigou.com\tprod-mining.oss-cn-shanghai.aliyuncs.com\tmining.vxiaoke.com\tmining.52hotpot.com\tprod-mining.oss-cn-shanghai.aliyuncs.com\tprod-mining.oss-cn-shanghai.aliyuncs.com\tprod-mining.oss-cn-shanghai.aliyuncs.com\n" +
                "mining-api.ksthotel.com\tmining-api.czsjnzx.com\tmining-api.mayiejia.com\tmining-api.jjxh120.com\tmining-api.xianhaotian.com\tmining-api.chenghaigou.com\tmining-api.duocaizhengxin.com\tmining-api.vxiaoke.com\tmining-api.52hotpot.com\tmining-api.hnjungle.com\tmining-api.ybdxshop.com\tmining-api.whjiapei.com\n" +
                "goal.888000.in\tgoal.coingame.cc\tgoal.coingame.one\tgoal.coingame01.com\tgoal.coingame02.com\tgoal.coingame03.com\tgoal.coingame04.com\tgoal.coingame05.com\tgoal.cslongteng.com\tgoal.zjc178.com\tgoal.jindingxinfang.com\tgoal.coingame158.com\n" +
                "goal.ksthotel.com\tgoal.czsjnzx.com\tprod-goal.oss-cn-shanghai.aliyuncs.com\tprod-goal.oss-cn-shanghai.aliyuncs.com\tgoal.xianhaotian.com\tgoal.chenghaigou.com\tprod-goal.oss-cn-shanghai.aliyuncs.com\tgoal.vxiaoke.com\tgoal.52hotpot.com\tprod-goal.oss-cn-shanghai.aliyuncs.com\tprod-goal.oss-cn-shanghai.aliyuncs.com\tprod-goal.oss-cn-shanghai.aliyuncs.com\n" +
                "goal-api.ksthotel.com\tgoal-api.czsjnzx.com\tgoal-api.mayiejia.com\tgoal-api.jjxh120.com\tgoal-api.xianhaotian.com\tgoal-api.chenghaigou.com\tgoal-api.duocaizhengxin.com\tgoal-api.vxiaoke.com\tgoal-api.52hotpot.com\tgoal-api.hnjungle.com\tgoal-api.ybdxshop.com\tgoal-api.whjiapei.com\n" +
                "baccarat.888000.in\tbaccarat.coingame.cc\tbaccarat.coingame.one\tbaccarat.coingame01.com\tbaccarat.coingame02.com\tbaccarat.coingame03.com\tbaccarat.coingame04.com\tbaccarat.coingame05.com\tbaccarat.cslongteng.com\tbaccarat.zjc178.com\tbaccarat.jindingxinfang.com\tbaccarat.coingame158.com\n" +
                "baccarat.ksthotel.com\tbaccarat.czsjnzx.com\tprod-baccarat.oss-cn-shanghai.aliyuncs.com\tprod-baccarat.oss-cn-shanghai.aliyuncs.com\tbaccarat.xianhaotian.com\tbaccarat.chenghaigou.com\tprod-baccarat.oss-cn-shanghai.aliyuncs.com\tbaccarat.vxiaoke.com\tbaccarat.52hotpot.com\tprod-baccarat.oss-cn-shanghai.aliyuncs.com\tprod-baccarat.oss-cn-shanghai.aliyuncs.com\tprod-baccarat.oss-cn-shanghai.aliyuncs.com\n" +
                "baccarat-api.ksthotel.com\tbaccarat-api.czsjnzx.com\tbaccarat-api.mayiejia.com\tbaccarat-api.jjxh120.com\tbaccarat-api.xianhaotian.com\tbaccarat-api.chenghaigou.com\tbaccarat-api.duocaizhengxin.com\tbaccarat-api.vxiaoke.com\tbaccarat-api.52hotpot.com\tbaccarat-api.hnjungle.com\tbaccarat-api.ybdxshop.com\tbaccarat-api.whjiapei.com\n" +
                "index.888000.in\tindex.coingame.cc\tindex.coingame.one\tindex.coingame01.com\tindex.coingame02.com\tindex.coingame03.com\tindex.coingame04.com\tindex.coingame05.com\tindex.cslongteng.com\tindex.zjc178.com\tindex.jindingxinfang.com\tindex.coingame158.com\n" +
                "prod-index.oss-cn-shanghai.aliyuncs.com\tprod-index.oss-cn-shanghai.aliyuncs.com\tprod-index.oss-cn-shanghai.aliyuncs.com\tprod-index.oss-cn-shanghai.aliyuncs.com\tprod-index.oss-cn-shanghai.aliyuncs.com\tprod-index.oss-cn-shanghai.aliyuncs.com\tprod-index.oss-cn-shanghai.aliyuncs.com\tprod-index.oss-cn-shanghai.aliyuncs.com\tprod-index.oss-cn-shanghai.aliyuncs.com\tprod-index.oss-cn-shanghai.aliyuncs.com\tprod-index.oss-cn-shanghai.aliyuncs.com\tprod-index.oss-cn-shanghai.aliyuncs.com\n" +
                "index-api.ksthotel.com\tindex-api.czsjnzx.com\tindex-api.mayiejia.com\tindex-api.jjxh120.com\tindex-api.xianhaotian.com\tindex-api.chenghaigou.com\tindex-api.duocaizhengxin.com\tindex-api.vxiaoke.com\tindex-api.52hotpot.com\tindex-api.hnjungle.com\tindex-api.ybdxshop.com\tindex-api.whjiapei.com\n" +
                "powerball.888000.in\tpowerball.coingame.cc\tpowerball.coingame.one\tpowerball.coingame01.com\tpowerball.coingame02.com\tpowerball.coingame03.com\tpowerball.coingame04.com\tpowerball.coingame05.com\tpowerball.cslongteng.com\tpowerball.zjc178.com\tpowerball.jindingxinfang.com\tpowerball.coingame158.com\n" +
                "prod-powerball.oss-cn-shanghai.aliyuncs.com\tprod-powerball.oss-cn-shanghai.aliyuncs.com\tprod-powerball.oss-cn-shanghai.aliyuncs.com\tprod-powerball.oss-cn-shanghai.aliyuncs.com\tprod-powerball.oss-cn-shanghai.aliyuncs.com\tprod-powerball.oss-cn-shanghai.aliyuncs.com\tprod-powerball.oss-cn-shanghai.aliyuncs.com\tprod-powerball.oss-cn-shanghai.aliyuncs.com\tprod-powerball.oss-cn-shanghai.aliyuncs.com\tprod-powerball.oss-cn-shanghai.aliyuncs.com\tprod-powerball.oss-cn-shanghai.aliyuncs.com\tprod-powerball.oss-cn-shanghai.aliyuncs.com\n" +
                "powerball-api.ksthotel.com\tpowerball-api.czsjnzx.com\tpowerball-api.mayiejia.com\tpowerball-api.jjxh120.com\tpowerball-api.xianhaotian.com\tpowerball-api.chenghaigou.com\tpowerball-api.duocaizhengxin.com\tpowerball-api.vxiaoke.com\tpowerball-api.52hotpot.com\tpowerball-api.hnjungle.com\tpowerball-api.ybdxshop.com\tpowerball-api.whjiapei.com\n" +
                "www.888000.in\twww.coingame.cc\twww.coingame.one\twww.coingame01.com\twww.coingame02.com\twww.coingame03.com\twww.coingame04.com\twww.coingame05.com\tsso.cslongteng.com\tsso.zjc178.com\tsso.coingame158.com\n" +
                "m.cslongteng.com\tm.zjc178.com\tm.coingame158.com\n" +
                "static.cslongteng.com\tstatic.zjc178.com\tstatic.coingame158.com\n" +
                "prod-m.oss-cn-shanghai.aliyuncs.com\tprod-m.oss-cn-shanghai.aliyuncs.com\tprod-m.oss-cn-shanghai.aliyuncs.com\n" +
                "api.52hotpot.com\tapi.hnjungle.com\tapi.whjiapei.com\n";
        domain = domain.replaceAll("\n", ",");
        domain = domain.replaceAll("\t", ",");
        String[] array = domain.split(",");
        StringBuffer stringBuffer = new StringBuffer("[");
        Set set = new HashSet();
        for (int i = 0; i <array.length; i++){
            int size = set.size();
            set.add(array[i]);
            if(set.size() > size){
                stringBuffer.append("\"" + array[i] + "\"" + ",");
            }
        }
        String result = stringBuffer.toString().substring(0, stringBuffer.length()-1) + "]";
        System.out.println(result);

    }
}
