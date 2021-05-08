package util;

import warrior.*;

public class Printer {
        private String[][] menus = {
                        { "Aragorn - The Human", "Legolas - The Elf", "Shagrat - The Orc", "Fae - An Unknown Fairy" },
                        { "Leather", "Chainmail", "Platemail" },
                        { "MorgulKnife - A Dagger", "Andúril - A Sword", "Dramborleg - And my axe!" } };

        public Printer() {
        }

        public static final String ANSI_BRIBLUE = "\u001b[34;1m";
        public static final String ANSI_BRICYAN = "\u001b[36;1m";
        public static final String ANSI_GREEN = "\u001b[32m";
        public static final String ANSI_BRIGREEN = "\u001b[32;1m";
        public static final String ANSI_BRIRED = "\u001b[31;1m";
        public static final String ANSI_RED = "\u001b[31m";
        public static final String ANSI_BRIMAGENTA = "\u001b[35;1m";
        public static final String ANSI_MAGENTA = "\u001b[35m";
        public static final String ANSI_BRIWHITE = " \u001b[37;1m";
        public static final String ANSI_BRIYELLOW = "\u001b[33;1m";
        public static final String ANSI_YELLOW = "\u001b[33m";
        public static final String ANSI_WHITE = "\u001b[37m";
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_PINK = "\033[38;5;219m";
        public static final String ANSI_ORANGE = "\033[38;5;208m";
        public static final String ANSI_BABYBLUE = "\033[38;5;57m";
        public static final String ANSI_TEAL = "\033[38;5;105m";
        public static final String ANSI_BBRED = "\u001b[41m";
        public static final String ANSI_BBLUE = "u001b[34;1m";
        public static final String ANSI_BWHITE = "\u001b[47m";
        public static final String ANSI_GOLD = "\033[38;5;100m";
        public static final String ANSI_BROWN = "\033[38;5;94m";
        public static final String ANSI_GREY = "\033[38;5;239m";
        public static final String ANSI_LTGREY = "\033[38;5;252m";
        public static final String ANSI_BLACK = "\033[38;5;232m";

        public void PrintMessageAragorn() {

                System.out.println("            " + ANSI_BRIYELLOW + ".;ccccc:,.");
                System.out.println("            ;dc'..*.,co:.");
                System.out.println("          :x,********.oo.");
                System.out.println("          .dc*******.*.c.");
                System.out.println("           ,k;*****...");
                System.out.println("            'x:*****.,'...");
                System.out.println("                 lo.*****..");
                System.out.println("                .';::lkko:;;;;:*******::::;,..");
                System.out.println("              .;::::,'...,c;,.****..****';::c:'.");
                System.out.println("           .,:,." + ANSI_PINK + "************ ******************" + ANSI_BRIYELLOW
                                + ".':cc.");
                System.out.println("           ,;." + ANSI_PINK + "******  ******************************"
                                + ANSI_BRIYELLOW + ",ll.");
                System.out.println("            :l." + ANSI_PINK + "*****************************************"
                                + ANSI_BRIYELLOW + ",o:");
                System.out.println("            cl." + ANSI_PINK + "*****************************************"
                                + ANSI_BRIYELLOW + ".ol.");
                System.out.println("            .o:" + ANSI_PINK + "******************************************"
                                + ANSI_BRIYELLOW + ".x;");
                System.out.println("            d;" + ANSI_PINK + "***" + ANSI_BRIYELLOW + "';;." + ANSI_PINK
                                + "***********" + ANSI_BRIYELLOW + ".,;:;." + ANSI_PINK + "********************"
                                + ANSI_BRIYELLOW + ".x:");
                System.out.println("            .o," + ANSI_PINK + "**:" + ANSI_BRIBLUE + "c." + ANSI_PINK
                                + "**************" + ANSI_BRIYELLOW + "',." + ANSI_PINK + "********************"
                                + ANSI_BRIYELLOW + "'o,");
                System.out.println("            .:." + ANSI_PINK + "**" + ANSI_BRIBLUE + "l0dl, " + ANSI_PINK
                                + "********" + ANSI_BRIYELLOW + ".. " + ANSI_PINK + "***********************"
                                + ANSI_BRIYELLOW + ";c.");
                System.out.println("            .c'" + ANSI_PINK + "**" + ANSI_BRIBLUE + ".dXKNO." + ANSI_PINK
                                + "*******" + ANSI_BRIBLUE + ".od;." + ANSI_PINK + "*********************"
                                + ANSI_BRIYELLOW + "'c'");
                System.out.println("            .l;" + ANSI_PINK + "****" + ANSI_BRIBLUE + "l00Oc" + ANSI_PINK
                                + "*******" + ANSI_BRIBLUE + ".oX00Ok;" + ANSI_PINK + "***************"
                                + ANSI_BRIMAGENTA + ".,,,,,co,");
                System.out.println("            'o," + ANSI_PINK + "*****.',''.." + ANSI_PINK + "****'" + ANSI_BRIBLUE
                                + "ONKXXKc" + ANSI_PINK + "*************... " + ANSI_PINK + "****" + ANSI_BRIMAGENTA
                                + ";d'");
                System.out.println("          ll" + ANSI_PINK + "*******" + ANSI_ORANGE + ".ckKKK0x:.  " + ANSI_BRIBLUE
                                + ":xddc'." + ANSI_PINK + "**************.,c:,'**" + ANSI_BRIMAGENTA + ".d:");
                System.out.println("          .o:" + ANSI_PINK + "*****" + ANSI_ORANGE + ".lKNWWWWNKx'" + ANSI_PINK
                                + "***." + ANSI_PINK + "*****************.;d;..**" + ANSI_BRIMAGENTA + ":d.");
                System.out.println("            .cl'" + ANSI_ORANGE + "*.lKNNNNWMWXd." + ANSI_PINK
                                + "*******************. .:;.**" + ANSI_BRIMAGENTA + ".cd,");
                System.out.println("               " + ANSI_ORANGE + "'cccoO00KKXWWNk'" + ANSI_PINK
                                + "***************.,:lc;," + ANSI_BRIMAGENTA + ",coc.");
                System.out.println("               " + ANSI_ORANGE + ".dKK0OkOKXWWXx." + ANSI_PINK + "**********"
                                + ANSI_BRIMAGENTA + "..,coc");
                System.out.println("               " + ANSI_ORANGE + ".l000OxkKXNK0x:''',;;'';" + ANSI_BRIMAGENTA
                                + ",cxc");
                System.out.println("                              " + ANSI_BABYBLUE + "dlcc,|||||ckc;:::::;.");
                System.out.println("                         " + ANSI_BABYBLUE + "cc..,,,lxl." + ANSI_PINK + "******;:."
                                + ANSI_PINK + "***" + ANSI_BABYBLUE + "..':ll'");
                System.out.println("                      " + ANSI_BABYBLUE + ",o.||.lc.." + ANSI_PINK
                                + "******************" + ANSI_BABYBLUE + ",dc.");
                System.out.println("                     " + ANSI_BABYBLUE + ".oo|l:" + ANSI_PINK
                                + "***********************" + ANSI_BABYBLUE + ".dc.'::'");
                System.out.println("                      " + ANSI_BABYBLUE + ",ddd;" + ANSI_PINK + "********.. .."
                                + ANSI_PINK + "***********" + ANSI_BABYBLUE + ";ko:,,ll.");
                System.out.println("                      " + ANSI_BABYBLUE + "'dOo," + ANSI_PINK + "*******"
                                + ANSI_BABYBLUE + ":c. .c." + ANSI_PINK + "**********" + ANSI_BABYBLUE + ".cc.***cd'");
                System.out.println("                  " + ANSI_BABYBLUE + ".,,,;oxkd'" + ANSI_PINK + "****"
                                + ANSI_BABYBLUE + ",oo,...ld'" + ANSI_PINK + "***********.*****" + ANSI_BABYBLUE
                                + ":o:.");
                System.out.println("                " + ANSI_BABYBLUE + "'oxc." + ANSI_PINK + "***" + ANSI_BABYBLUE
                                + ".:c." + ANSI_PINK + "**" + ANSI_BABYBLUE + "'looldOd;':xc." + ANSI_MAGENTA
                                + "*********.." + ANSI_PINK + "*****" + ANSI_BABYBLUE + ".;d,");
                System.out.println("                " + ANSI_BABYBLUE
                                + "'xOdo;,:,,locclc;::;;;;::clll:,..',;:ll:;;;;:cc.");
                System.out.println("                 .,;;''::;,.                .;:;;;,.   ......");
                System.out.println();
        }

        public void PrintMessageLegolas() {

                System.out.println("                                                   " + ANSI_BABYBLUE + ".;:'"
                                + ANSI_TEAL + "******':;.");
                System.out.println("                                                   :: " + ANSI_TEAL + "*********"
                                + ANSI_BABYBLUE + "::");
                System.out.println("                                   ....'',,,,,,,,,co'" + ANSI_TEAL + "**********"
                                + ANSI_BABYBLUE + "'c.");
                System.out.println("                             ..,,,,,,,''...........l, " + ANSI_TEAL + "**********"
                                + ANSI_BABYBLUE + ";c.");
                System.out.println("                        .',,,,.. " + ANSI_TEAL + "*****************.c;." + ANSI_TEAL
                                + "******" + ANSI_BABYBLUE + ".;c.");
                System.out.println("                      .,;;,. " + ANSI_TEAL + "************************"
                                + ANSI_BABYBLUE + ",;,,'',:o;");
                System.out.println("                    .;;,. " + ANSI_TEAL + "*****************************"
                                + ANSI_BABYBLUE + ".....cc");
                System.out.println("                  ':;." + ANSI_TEAL + "***..'',,,'''',,,,,''''',,,,''.. "
                                + ANSI_TEAL + "****" + ANSI_BABYBLUE + ".c'");
                System.out.println("                '::,',,,,,,'... " + ANSI_TEAL + "***************" + ANSI_BABYBLUE
                                + "...'',,,',,;ol.");
                System.out.println("              'ox:,,'.. " + ANSI_TEAL + "*********************************"
                                + ANSI_BABYBLUE + "..,l,");
                System.out.println("            .c:'." + ANSI_TEAL + "*******************************************"
                                + ANSI_BABYBLUE + ":;");
                System.out.println("            ,c. " + ANSI_TEAL + "*********....,;:;,,,'''''''',,,,,''.. " + ANSI_TEAL
                                + "******" + ANSI_BABYBLUE + ":;");
                System.out.println("   ':'',,,. ,l...',,,,'',;coool;.. " + ANSI_TEAL + "***********" + ANSI_BABYBLUE
                                + "....',,,,,,'..c;.',,'';:.");
                System.out.println("   ;c ***..,;lkd:;dl..**.;ccc:'. " + ANSI_TEAL + "***********" + ANSI_BABYBLUE
                                + "..... " + ANSI_TEAL + "*******" + ANSI_BABYBLUE + ".'cxOo;'.." + ANSI_TEAL + "**"
                                + ANSI_BABYBLUE + "'c.");
                System.out.println("   .c. .';:,,oo. .c. ,dko;,',,,,;. " + ANSI_TEAL + "*****" + ANSI_BABYBLUE
                                + "';,,,,,,,;,. " + ANSI_TEAL + "*****" + ANSI_BABYBLUE + ",dc';:,'. ;:");
                System.out.println("    :; **:o;;oo.**.cdOo. " + ANSI_TEAL + "*******" + ANSI_BABYBLUE + ".::."
                                + ANSI_TEAL + "**" + ANSI_BABYBLUE + ".:;. " + ANSI_TEAL + "*******" + ANSI_BABYBLUE
                                + "'c, " + ANSI_TEAL + "****" + ANSI_BABYBLUE + ",dl;:o," + ANSI_TEAL + "**"
                                + ANSI_BABYBLUE + ".c,");
                System.out.println("    .c'" + ANSI_TEAL + "**" + ANSI_BABYBLUE + "::" + ANSI_TEAL + "**"
                                + ANSI_BABYBLUE + ":d' " + ANSI_TEAL + "**" + ANSI_BABYBLUE + ".oc " + ANSI_TEAL
                                + "************" + ANSI_BABYBLUE + ",c:cc' " + ANSI_TEAL + "**********" + ANSI_BABYBLUE
                                + ".c, " + ANSI_TEAL + "***" + ANSI_BABYBLUE + ";d' .c," + ANSI_TEAL + "**"
                                + ANSI_BABYBLUE + "::");
                System.out.println("    .c, .' " + ANSI_TEAL + "**" + ANSI_BABYBLUE + ";: " + ANSI_TEAL + "***"
                                + ANSI_BABYBLUE + "c; " + ANSI_TEAL + "*******" + ANSI_BABYBLUE + ".." + ANSI_TEAL
                                + "***" + ANSI_BABYBLUE + "c0O;" + ANSI_TEAL + "**" + ANSI_BABYBLUE + "... " + ANSI_TEAL
                                + "*******" + ANSI_BABYBLUE + ":: **.c," + ANSI_TEAL + "**" + ANSI_BABYBLUE + ".' .:;");
                System.out.println("      .;:,. " + ANSI_TEAL + "**" + ANSI_BABYBLUE + ".c' " + ANSI_TEAL + "**"
                                + ANSI_BABYBLUE + ",c. " + ANSI_TEAL + "*****" + ANSI_BABYBLUE + ".xO' " + ANSI_TEAL
                                + "*" + ANSI_BABYBLUE + "cOk:" + ANSI_TEAL + "* " + ANSI_BABYBLUE + ":0c " + ANSI_TEAL
                                + "*******" + ANSI_BABYBLUE + ".c' " + ANSI_TEAL + "***" + ANSI_BABYBLUE + ";: "
                                + ANSI_TEAL + "***" + ANSI_BABYBLUE + ".;:'");
                System.out.println("        .,,,,,'cd. " + ANSI_TEAL + "**" + ANSI_BABYBLUE + ",c' " + ANSI_TEAL
                                + "*****" + ANSI_BABYBLUE + ".. .:;.'::.... " + ANSI_TEAL + "******" + ANSI_BABYBLUE
                                + "'c'" + ANSI_TEAL + "****" + ANSI_BABYBLUE + ";d:',,,,.");
                System.out.println("            ..'';c' " + ANSI_TEAL + "***" + ANSI_BABYBLUE + ".;;,'...',,;' "
                                + ANSI_TEAL + "***" + ANSI_BABYBLUE + ",;,,'..'',;,. " + ANSI_TEAL + "***"
                                + ANSI_BABYBLUE + ",l,'..");
                System.out.println("                 .:;. " + ANSI_TEAL + "***" + ANSI_BABYBLUE + ".''','.." + ANSI_TEAL
                                + "**" + ANSI_BABYBLUE + ".. " + ANSI_TEAL + "****" + ANSI_BABYBLUE + ".,;,,''. ."
                                + ANSI_TEAL + "****" + ANSI_BABYBLUE + ":;.");
                System.out.println("                   ':,. " + ANSI_TEAL + "**********" + ANSI_BABYBLUE
                                + ".:ddo:;;ll. " + ANSI_TEAL + "******" + ANSI_BABYBLUE + ".;:.");
                System.out.println("                     ,;;. " + ANSI_TEAL + "*********" + ANSI_BABYBLUE + ".',,,,,. "
                                + ANSI_TEAL + "*****" + ANSI_BABYBLUE + "';;'");
                System.out.println("                       :Ox:'. " + ANSI_TEAL + "**************" + ANSI_BABYBLUE
                                + "..,cOO,");
                System.out.println("                      .dkooo:,,,,;,'''';;,,,,;lodkl.");
                System.out.println("                     ':cc..,:;..clcloocco:  .::.'c;:.");
                System.out.println("                    .c';:    .,:;'l:,co,.l:;;.**.c''c.");
                System.out.println("                    ;:.:; *" + ANSI_TEAL + "***" + ANSI_BABYBLUE + "&" + ANSI_TEAL
                                + "****" + ANSI_BABYBLUE + "',,;,. .. " + ANSI_TEAL + "*****" + ANSI_BABYBLUE
                                + "c; ::");
                System.out.println("                   .c,.c, " + ANSI_TEAL + "***********************" + ANSI_BABYBLUE
                                + ";: ,c.");
                System.out.println("                   'o;;o' " + ANSI_TEAL + "********" + ANSI_BABYBLUE + ",:;;:. "
                                + ANSI_TEAL + "********" + ANSI_BABYBLUE + ",l':l.");
                System.out.println("                   .olco. " + ANSI_TEAL + "*******" + ANSI_BABYBLUE + ".::,:c' "
                                + ANSI_TEAL + "*********" + ANSI_BABYBLUE + "'dcoc");
                System.out.println("                    .;lo'...... " + ANSI_TEAL + "***" + ANSI_BABYBLUE + ".'.."
                                + ANSI_TEAL + "***" + ANSI_BABYBLUE + "..'''..'oc;.");
                System.out.println("                     .lo;,''',,,,. " + ANSI_TEAL + "****" + ANSI_BABYBLUE
                                + ".,;,,''',,:d:");
                System.out.println("                   .;:' " + ANSI_TEAL + "*******" + ANSI_BABYBLUE + "'::. .,c' "
                                + ANSI_TEAL + "******" + ANSI_BABYBLUE + ".;:.");
                System.out.println("                  .:; " + ANSI_TEAL + "************" + ANSI_BABYBLUE + "'lod: "
                                + ANSI_TEAL + "***********" + ANSI_BABYBLUE + ".c,");
                System.out.println("                 'c;''''''''''''''col;''''''''''''''::.");

                System.out.println();

        }

        public void PrintMessageShagrat() {

                System.out.println("           " + ANSI_BRIGREEN + ",OO0XWWMMWXOo;.");
                System.out.println("          cN0o:'." + ANSI_BRIYELLOW + "****" + ANSI_BRIGREEN + "':cokXkl,.");
                System.out.println("     cxkXd," + ANSI_BRIYELLOW + ".**************" + ANSI_BRIGREEN + ".,cxKd;.");
                System.out.println(
                                "...cxWXkc." + ANSI_BRIYELLOW + "***********************.," + ANSI_BRIGREEN + "ck0l.");
                System.out.println("lXko:." + ANSI_BRIYELLOW + "******************************" + ANSI_BRIGREEN
                                + "'oKWKl.");
                System.out.println("ld'" + ANSI_BRIYELLOW + "*************************" + ANSI_BRIGREEN + ".,:llool'"
                                + ANSI_BRIYELLOW + "***" + ANSI_BRIGREEN + "WNc.     :c;.");
                System.out.println(";kx:." + ANSI_BRIYELLOW + "******************" + ANSI_BRIGREEN + ".,lkK0O:"
                                + ANSI_BRIYELLOW + "**" + ANSI_BRIGREEN + ";XMd" + ANSI_BRIYELLOW + "**" + ANSI_BRIGREEN
                                + "***" + ANSI_BRIGREEN + "      lOWd.");
                System.out.println("    ko;." + ANSI_BRIYELLOW + "*******" + ANSI_BRIGREEN + "..';lxOMMo." + ANSI_BRIRED
                                + "****" + ANSI_BRIGREEN + ",KMk" + ANSI_BRIYELLOW + "******" + ANSI_BRIGREEN + "**"
                                + ANSI_BRIGREEN + "  'ckdo 0MK,");
                System.out.println("     lKxkkNN0Oxl;.cXMMM" + ANSI_BRIRED + "******" + ANSI_BRIGREEN + ".OMK,"
                                + ANSI_BRIYELLOW + "*******" + ANSI_BRIGREEN + "Ko0NWXx;." + ANSI_BRIYELLOW + "**"
                                + ANSI_BRIGREEN + "WW");
                System.out.println("...,OOo:," + ANSI_BRIRED + "***" + ANSI_BRIGREEN + "'0MMMx." + ANSI_BRIYELLOW
                                + "*****" + ANSI_BRIGREEN + "lWWo.lKM" + ANSI_BRIYELLOW + "**********" + ANSI_BRIGREEN
                                + "KMk" + ANSI_BRIYELLOW + "********" + ANSI_BRIGREEN + "dMN");
                System.out.println(".o0'," + ANSI_BRIRED + "****" + ANSI_BRIGREEN + ";kkcMO;" + ANSI_BRIYELLOW + "***"
                                + ANSI_BRIGREEN + ",kWN:" + ANSI_BRIYELLOW + "**" + ANSI_BRIGREEN + "'0MXd'"
                                + ANSI_BRIYELLOW + "**********" + ANSI_BRIGREEN + "0M0" + ANSI_BRIYELLOW + "********"
                                + ANSI_BRIGREEN + "dMN");
                System.out.println(":Kx." + ANSI_BRIGREEN + "****" + ANSI_BRIGREEN + ".:xx;." + ANSI_BRIYELLOW + "****"
                                + ANSI_BRIGREEN + ".,dKoc:;,,;" + ANSI_BRIYELLOW + "**********" + ANSI_BRIGREEN
                                + "cXMNd." + ANSI_BRIYELLOW + "***********" + ANSI_BRIGREEN + "kMK");
                System.out.println(":Xd." + ANSI_BRIYELLOW + "**" + ANSI_BRIGREEN + ",oO;" + ANSI_BRIYELLOW
                                + "*********" + ANSI_BRIGREEN + ".':ONXkkdl'" + ANSI_BRIYELLOW + "*******"
                                + ANSI_BRIGREEN + " oNWo" + ANSI_BRIYELLOW + "**************" + ANSI_BRIGREEN + "dMN");
                System.out.println(".kx,cON0:." + ANSI_BRIYELLOW + "************" + ANSI_BRIGREEN + ".;xXkol:'."
                                + ANSI_BRIYELLOW + "******" + ANSI_BRIGREEN + ".kMK," + ANSI_BRIYELLOW + "***********"
                                + ANSI_BRIGREEN + "..dMW");
                System.out.println(";Xk;ko." + ANSI_BRIYELLOW + "************************************" + ANSI_BRIGREEN
                                + ".dMX;" + ANSI_BRIYELLOW + "******" + ANSI_BRIGREEN + "*;0MX");
                System.out.println("cc;KO'" + ANSI_BRIYELLOW + "**************************************" + ANSI_BRIGREEN
                                + ".OMX;" + ANSI_BRIYELLOW + "******" + ANSI_BRIGREEN + ".oNd");
                System.out.println(";Xd,k." + ANSI_BRIYELLOW + "**********************************" + ANSI_BRIGREEN
                                + ".xWM0'" + ANSI_BRIYELLOW + "*********" + ANSI_BRIGREEN + ",KMK: ");
                System.out.println(".x;Kc" + ANSI_BRIYELLOW + "*********************************" + ANSI_BRIGREEN
                                + ".:0WW0," + ANSI_BRIYELLOW + "*********" + ANSI_BRIGREEN + "'0MO. ");
                System.out.println("co.d," + ANSI_BRIYELLOW + "**********************************" + ANSI_BRIGREEN
                                + "'xNMMK;" + ANSI_BRIYELLOW + "********" + ANSI_BRIGREEN + "oWNc ");
                System.out.println("'k..'" + ANSI_BRIYELLOW + "*********************************" + ANSI_BRIGREEN
                                + "cXMKOXO." + ANSI_BRIYELLOW + "******" + ANSI_BRIGREEN + ".kMX:");
                System.out.println(".kK,*.k;" + ANSI_BRIYELLOW + "***********************" + ANSI_BRIGREEN + ",'."
                                + ANSI_BRIYELLOW + "**,Oo.:Xx." + ANSI_BRIYELLOW + "***" + ANSI_BRIGREEN + ".,cdXc");
                System.out.println("dWWo**.lkxc;.." + ANSI_BRIYELLOW + "****" + ANSI_BRIGREEN + ".'c." + ANSI_BRIYELLOW
                                + "******" + ANSI_BRIGREEN + ".oOkxk'" + ANSI_BRIYELLOW + "******" + ANSI_BRIGREEN
                                + "....:N0c:0d'");
                System.out.println("'OMX:" + ANSI_BRIYELLOW + "***" + ANSI_BRIGREEN + ".':ollc:cl:." + ANSI_BRIYELLOW
                                + "****.1" + ANSI_BRIGREEN + "0d" + ANSI_BRIWHITE + ";[lkt" + ANSI_BRIGREEN + "0:"
                                + ANSI_BRIYELLOW + "********" + ANSI_BRIGREEN + ":NKxdlc;..");
                System.out.println(".,c0MK," + ANSI_BRIYELLOW + "******.'',,';odokk" + ANSI_BRIGREEN + "ONx"
                                + ANSI_BRIWHITE + ";KW%Hk" + ANSI_BRIGREEN + "K;" + ANSI_BRIYELLOW + "******"
                                + ANSI_BRIGREEN + ";XMWx;xO:");
                System.out.println(".dk" + ANSI_BRIWHITE + ";kKW" + ANSI_BRIGREEN + "Wd..;:cldxO0XNWWWMMMWXXW0"
                                + ANSI_BRIWHITE + "OK" + ANSI_BRIGREEN + "0," + ANSI_BRIYELLOW + "******"
                                + ANSI_BRIGREEN + "'OMN:" + ANSI_BRIYELLOW + "**" + ANSI_BRIGREEN + "cOx'");
                System.out.println("dO" + ANSI_BRIWHITE + "LK***%" + ANSI_BRIGREEN + "WNNXXOxoollllc;,::lloW0c."
                                + ANSI_BRIGREEN + "**" + ANSI_BRIGREEN + "'.***" + ANSI_BRIYELLOW + "*******"
                                + ANSI_BRIGREEN + "'x0c.");
                System.out.println("'00" + ANSI_BRIWHITE + "dWX" + ANSI_BRIGREEN + "ko:;,'.." + ANSI_BRIYELLOW
                                + "***********************" + ANSI_BRIGREEN + "***KMk." + ANSI_BRIYELLOW + "******"
                                + ANSI_BRIGREEN + ".:Ox,");
                System.out.println(".o0WWoc;." + ANSI_BRIYELLOW + "*******************************" + ANSI_BRIGREEN
                                + "cNWl" + ANSI_BRIYELLOW + "********" + ANSI_BRIGREEN + ".o0x'");
                System.out.println(" Ok:." + ANSI_BRIYELLOW + "**********************************" + ANSI_BRIGREEN
                                + "kMK," + ANSI_BRIYELLOW + "**********" + ANSI_BRIGREEN + "oOd.");
                System.out.println("NMk." + ANSI_BRIYELLOW + "************************************" + ANSI_BRIGREEN
                                + "ckN0'" + ANSI_BRIYELLOW + "********" + ANSI_BRIGREEN + ".lMx:");
                System.out.println("MM0'" + ANSI_BRIYELLOW + "****************************************************"
                                + ANSI_BRIGREEN + "xMNx");
                System.out.println("MM0'" + ANSI_BRIYELLOW + "********************************************"
                                + ANSI_BRIGREEN + "OXc&&" + ANSI_BRIYELLOW + "*" + ANSI_BRIGREEN + "");
                System.out.println("XMX;" + ANSI_BRIYELLOW + "****************************************" + ANSI_BRIGREEN
                                + "KMK:" + ANSI_BRIYELLOW + "*******" + ANSI_BRIGREEN + "");
                System.out.println("kMWo" + ANSI_BRIYELLOW + "************************************" + ANSI_BRIGREEN
                                + ".cONNk'" + ANSI_BRIYELLOW + "*******" + ANSI_BRIGREEN + "");
                System.out.println("lWMK," + ANSI_BRIYELLOW + "********************************" + ANSI_BRIGREEN
                                + ".c0WNx," + ANSI_BRIYELLOW + "*********" + ANSI_BRIGREEN + "");
                System.out.println(".OMWO'" + ANSI_BRIYELLOW + "**************************" + ANSI_BRIGREEN
                                + "..;o0WXx," + ANSI_BRIYELLOW + "************" + ANSI_BRIGREEN + "");
                System.out.println(";KMMO." + ANSI_BRIYELLOW + "*********************" + ANSI_BRIGREEN + "':ok0WN0o'"
                                + ANSI_BRIYELLOW + "**************" + ANSI_BRIGREEN + "");
                System.out.println("   :XMWx." + ANSI_BRIYELLOW + "****************" + ANSI_BRIGREEN + ".;lxkKxl;'."
                                + ANSI_BRIYELLOW + "**************" + ANSI_BRIGREEN + "");
                System.out.println("      :0MWk'" + ANSI_BRIGREEN + "kjl;oOWlkjlXOdl:,;clc." + ANSI_BRIYELLOW
                                + "****************" + ANSI_BRIGREEN + "");
                System.out.println("       'xdc,." + ANSI_BRIGREEN + "jhkldHJKk00KXWMMMWKKOddddxdlc;." + ANSI_BRIYELLOW
                                + "****" + ANSI_BRIGREEN + "");

                System.out.println();

        }

        public void PrintFai() {

                System.out.println(ANSI_BABYBLUE + "                       .,;;;,:l:,,,,,;;;;;:,.");
                System.out.println("                     .,::;;'..':'           .;cc'");
                System.out.println("                   .:c;.   ..,,.               .:c'");
                System.out.println("                  ;l,    .''.                    .l:.");
                System.out.println("                .:c.   ',.   ..                    :l.");
                System.out.println("                :c.   ..    ,cc,.                   ;l.");
                System.out.println("               'l.       .,:;..lo,.                  :c.");
                System.out.println("               ;c      ','.    .:l;'...              .c;");
                System.out.println(" ':;,,,,,,,,,''l;    .,.         .. ...'.             ;c ");
                System.out.println(".oc       .',,,o:   .;. .:lol'          ..'.          'c.");
                System.out.println(" cl        ,;..:l.  ,;.:xxcxkdo.         'cooc.       .:.");
                System.out.println(" .l;       .,. .c;  ,;.lO;.. .oc       .;:xkclxo'     ';.");
                System.out.println("  .l,        ''..:' ';  ,:'..'xl      ':. ....'xx,    ,'");
                System.out.println("   .l,        ...,:,.;'   .',;l,    ..,:;'.,c:;,.''  'c'");
                System.out.println("    .c:.         .':;.'.             ...''''..   .. ':");
                System.out.println("      ,c,          ''''.l.                      l .,, .,;.");
                System.out.println("       .;:'           .,'.lil,n n;n;n,vs,ccbjlc'''l;........'','',,");
                System.out.println("         .;:,.         .,,.  .lk:.....'c;.....',,'..             ..';;;;.");
                System.out.println("           .,;,.         .;' ;k;     .o0;    .'.                      .';c;");
                System.out.println("              .,;,'        ':O0,    .,xd     .                           :d");
                System.out.println("              .',::'.        ;xl.     :x,                              'c:");
                System.out.println("          .,,,,.              .;.      cd.                          .,::.");
                System.out.println("        ,:;'.               ....       .,                        .,;:,.");
                System.out.println("      ,c;.                 ,l;          ,'                  .',,,;'.");
                System.out.println("    'l:.                 .;''::c,        ,.      ....'',,,',,'..");
                System.out.println("   ;l.                  .;.   .':;,,;:;'.;'     .cl;''.");
                System.out.println("  :o.                  .:.         .'';:co'       ';.");
                System.out.println(" ,d'                  .c;               ,:.        .:,");
                System.out.println(" ol                  .co'              ;:.          .:;");
                System.out.println(".d;                .,'':.           '::,              ::");
                System.out.println(".o;            .',,'. .;.        .',co'               .c;");
                System.out.println(" lc      .',,,,,..   .,.     .',,'. 'l'                'l.");
                System.out.println(" ;d. .,;,;,..      .,'... .'''.     .:;.                c:");
                System.out.println(" .co::'          .,'  .. ';.          ,:.               :c ");
                System.out.println("   ::           .;'     ';.            ,:.              cc");
                System.out.println("                ,,    .,;.              .c,            .l:");
                System.out.println("               .;.  .,;.                 .;c,          ;o.");
                System.out.println("              .;..';,.                     .:c'       'o,");
                System.out.println("             .oo,''                          .cc.    ,l'");
                System.out.println("            'dd;.                              ,c. .cc.");
                System.out.println("            ..                                  :o:c'");
                System.out.println("                                                .;.");
                System.out.println();
        }

        public void WelcomeMessageSpellProtects() {

                System.out.println(ANSI_BABYBLUE + "................" + ANSI_ORANGE + "*             ");
                System.out.println(ANSI_BABYBLUE + "..............." + ANSI_ORANGE + "**" + ANSI_BRIYELLOW
                                + "dc           *");
                System.out.println(ANSI_BABYBLUE + ".............." + ANSI_ORANGE + "***" + ANSI_BRIYELLOW
                                + ";0Xd'      xl");
                System.out.println(ANSI_BABYBLUE + "............." + ANSI_ORANGE + "***" + ANSI_BRIYELLOW
                                + "lXMWOOllodlo,          ");
                System.out.println(ANSI_BABYBLUE + "....." + ANSI_ORANGE + "***" + ANSI_BRIYELLOW
                                + ",clxKWWMWWMMMWWWWNx,          ");
                System.out.println(ANSI_BABYBLUE + "......." + ANSI_ORANGE + "***" + ANSI_BRIYELLOW
                                + ";oOXWMMMMMKKWMMc,         ");
                System.out.println(ANSI_BABYBLUE + ".......... " + ANSI_ORANGE + "***" + ANSI_BRIYELLOW
                                + ":xNMMMKMMMXo,          ");
                System.out.println(ANSI_BABYBLUE + "..........." + ANSI_ORANGE + "***" + ANSI_BRIYELLOW
                                + ";KMWXO KNXdo          ");
                System.out.println(ANSI_BABYBLUE + ".........." + ANSI_ORANGE + "***" + ANSI_BRIYELLOW
                                + "cXNx,     ;Kdc,          ");
                System.out.println(ANSI_BABYBLUE + "......." + ANSI_ORANGE + "***" + ANSI_BRIYELLOW
                                + "cx:             c;          ");
                System.out.println();
        }

        public void WelcomeMessageSpellPoisens() {

                System.out.println(ANSI_BABYBLUE + "................." + ANSI_BRIGREEN + "*             ");
                System.out.println(ANSI_BABYBLUE + "..............." + ANSI_BRIRED + "**" + ANSI_BRIGREEN
                                + "dc           *");
                System.out.println(ANSI_BABYBLUE + ".............." + ANSI_BRIRED + "***" + ANSI_BRIGREEN
                                + ";0Xd'      xl");
                System.out.println(ANSI_BABYBLUE + "............." + ANSI_BRIRED + "***" + ANSI_BRIGREEN
                                + "lXMWOOllodlo,          ");
                System.out.println(ANSI_BABYBLUE + "....." + ANSI_BRIRED + "***" + ANSI_BRIGREEN
                                + ",clxKWWMWWMMMWWWWNx,          ");
                System.out.println(ANSI_BABYBLUE + "......." + ANSI_BRIRED + "***" + ANSI_BRIGREEN
                                + ";oOXWMMMMMKKWMMc,         ");
                System.out.println(ANSI_BABYBLUE + ".......... " + ANSI_BRIRED + "***" + ANSI_BRIGREEN
                                + ":xNMMMKMMMXo,          ");
                System.out.println(ANSI_BABYBLUE + "..........." + ANSI_BRIRED + "***" + ANSI_BRIGREEN
                                + ";KMWXO KNXdo          ");
                System.out.println(ANSI_BABYBLUE + ".........." + ANSI_BRIRED + "***" + ANSI_BRIGREEN
                                + "cXNx,     ;Kdc,          ");
                System.out.println(ANSI_BABYBLUE + "......." + ANSI_BRIRED + "***" + ANSI_BRIGREEN
                                + "cx:             c;          ");
                System.out.println();
        }

        public void PrintMessageMorgulKnife() {

                System.out.println(
                                ANSI_BABYBLUE + ".......................................     " + ANSI_BRIRED + "...");
                System.out.println(ANSI_BABYBLUE + "..................................     " + ANSI_BRIRED
                                + "..''',,,,,'..");
                System.out.println(ANSI_BABYBLUE + ".............................     " + ANSI_BRIRED
                                + "',,ll:;'',,,,,'*");
                System.out.println(ANSI_BABYBLUE + ".............................     " + ANSI_BRIRED + ".,'"
                                + ANSI_GOLD + "lK0dol:" + ANSI_BRIRED + ",','..'.");
                System.out.println(ANSI_BABYBLUE + ".............................     " + ANSI_BRIRED + ".'."
                                + ANSI_GOLD + "cxdddddc" + ANSI_BRIRED + ".'.  .'.");
                System.out.println(ANSI_BABYBLUE + ".............................     " + ANSI_BRIRED + ".,..;;"
                                + ANSI_GOLD + "ldoc" + ANSI_BRIRED + ",.''   ..");
                System.out.println(ANSI_BABYBLUE + ".............................     " + ANSI_BRIRED + ".''"
                                + ANSI_GOLD + "oO" + ANSI_BRIRED + ":,:,..',.    . ");
                System.out.println(ANSI_BABYBLUE + ".............................     " + ANSI_BRIRED + ".'" + ANSI_GOLD
                                + "oX0d" + ANSI_BRIRED + ":'..''. ");
                System.out.println(ANSI_BABYBLUE + "...................','.......     " + ANSI_BRIRED + ".;" + ANSI_GOLD
                                + "0X0xdc" + ANSI_BRIRED + ".',.");
                System.out.println(ANSI_BABYBLUE + "..............';     " + ANSI_GOLD + "lodo" + ANSI_BRIRED + ":,..."
                                + ANSI_BRIRED + ".,..;;" + ANSI_GOLD + "ldoc");
                System.out.println(ANSI_BABYBLUE + "..............'';     " + ANSI_GOLD + "lxOOkxolc" + ANSI_BRIRED
                                + ";' ," + ANSI_BRIRED + "" + ANSI_GOLD + "kkdoc" + ANSI_BRIRED + ",.,.");
                System.out.println(ANSI_BABYBLUE + "..............,;,;;:     " + ANSI_GOLD + "Klxkkxdlcodol"
                                + ANSI_BRIRED + ANSI_GOLD + "kkdoc" + ANSI_BRIRED + ",.,.");
                System.out.println(ANSI_BABYBLUE + "..................'',     " + ANSI_GOLD + "cdokOOO0kxl"
                                + ANSI_BRIRED + "'.,'.");
                System.out.println(ANSI_BABYBLUE + "............''',;,..;     " + ANSI_GOLD + "cxsxcond0KKOxxo"
                                + ANSI_BRIRED + ":;,'.");
                System.out.println(ANSI_BABYBLUE + ".................,'';     " + ANSI_GOLD + "xccc,o:xOxddddolc"
                                + ANSI_BRIRED + ":;,'.");
                System.out.println(ANSI_BABYBLUE + ".................',':     " + ANSI_GOLD + "caxxdcccldololoodxdol"
                                + ANSI_BRIRED + ":'.");
                System.out.println(ANSI_BABYBLUE + "..................,,     " + ANSI_GOLD + "acdx:x00d:ocxsnmoselddl"
                                + ANSI_BRIRED + ";'.");
                System.out.println(ANSI_BABYBLUE + "..................,;     " + ANSI_GOLD + "nockll0XklkXx"
                                + ANSI_BRIRED + ".,..;;';'`");
                System.out.println(ANSI_BABYBLUE + "...................,     " + ANSI_GOLD + "acodxckX0ldKKOl"
                                + ANSI_BRIRED + ";,..");
                System.out.println(ANSI_BABYBLUE + "....................     " + ANSI_GOLD + "cxodcovXKdl0K0Kk"
                                + ANSI_BRIRED + ";'.");
                System.out.println(ANSI_BABYBLUE + "........... ......,     " + ANSI_GOLD + "ddoooKNklOX0KKo"
                                + ANSI_BRIRED + "'.");
                System.out.println(ANSI_BABYBLUE + ".................'     " + ANSI_GOLD + "ldoOW0okMLXK0Kx"
                                + ANSI_BRIRED + "'.");
                System.out.println(ANSI_BABYBLUE + "................';     " + ANSI_GOLD + "ookNKdkXMNX0Kk"
                                + ANSI_BRIRED + ";.");
                System.out.println(ANSI_BABYBLUE + "...............,,     " + ANSI_GOLD + "loxNXxkXXMNKKO" + ANSI_BRIRED
                                + ":.");
                System.out.println(ANSI_BABYBLUE + "...............:'     " + ANSI_GOLD + "oldXNkkKXXKOc" + ANSI_BRIRED
                                + ".");
                System.out.println(ANSI_BABYBLUE + "..............;.     " + ANSI_GOLD + "ccdKNOOKXXXkc" + ANSI_BRIRED
                                + ".");
                System.out.println(ANSI_BABYBLUE + "..............;     " + ANSI_GOLD + "coxKNOOKKXXk" + ANSI_BRIRED
                                + ":'");
                System.out.println(
                                ANSI_BABYBLUE + "............,:     " + ANSI_GOLD + "l0WXO0KKXKd" + ANSI_BRIRED + ";.");
                System.out.println(
                                ANSI_BABYBLUE + "...........,:     " + ANSI_GOLD + "l0X0O0XXX0o" + ANSI_BRIRED + ",.");
                System.out.println(
                                ANSI_BABYBLUE + "..........,;     " + ANSI_GOLD + "l0KOOKXXXkc" + ANSI_BRIRED + "'.");
                System.out.println(ANSI_BABYBLUE + "........,;     " + ANSI_GOLD + "l00OXNNX0o" + ANSI_BRIRED + ";..");
                System.out.println(ANSI_BABYBLUE + ".......,;     " + ANSI_GOLD + "oOO0XNX0d" + ANSI_BRIRED + ";'.");
                System.out.println(ANSI_BABYBLUE + "......';     " + ANSI_GOLD + "cdkO0X0dl" + ANSI_BRIRED + ":'.");
                System.out.println(ANSI_BABYBLUE + ".....';     " + ANSI_GOLD + "coxO00kl" + ANSI_BRIRED + ";...");
                System.out.println(ANSI_BABYBLUE + "..',:     " + ANSI_GOLD + "dO0Okdc" + ANSI_BRIRED + ",..");
                System.out.println(ANSI_BABYBLUE + ".',,;     " + ANSI_GOLD + "oO0ko" + ANSI_BRIRED + ":,..");
                System.out.println(ANSI_BABYBLUE + "...,:     " + ANSI_GOLD + "oc" + ANSI_BRIRED + ";'..");
                System.out.println();
                System.out.println();
        }

        public void PrintMessageAndúril() {

                System.out.println(ANSI_GREY + "                                                     ....;clll;");
                System.out.println("                                               'loddxO000KK0OO:");
                System.out.println("                                             .lOKKKKKKKKK0Okkx'");
                System.out.println("                                           .ckKKKKKKKKK0OkkkOo.");
                System.out.println("                                          ;xKKKKKKKKK0Okkkkkk:");
                System.out.println("                                        .l0KKKKKKKK0Okkkkkkkx'");
                System.out.println("                                      .lO0KKKKKKK0Okkkkkkkkko.");
                System.out.println("                                     ;kKKKKKKKK0Okkkkkkkkkkx,");
                System.out.println("                                    'd0KKKKKKK0Okkkkkkkkkko;.");
                System.out.println("                                  .lOKKKKKKK0Okkkkkkkkkkl,.");
                System.out.println("                                 .cOKKKKKKK0OOkkkkkkkkxc' ");
                System.out.println("                                 d0KKKKKK0Okkkkkkkkkd:.");
                System.out.println("                              'd0KKKKKK0Okkkkkkkkko,.");
                System.out.println("                            .lOKKKKKKK0Okkkkkkkkxl'");
                System.out.println("                          .:kKKKKKKK0Okkkkkkkkd:.");
                System.out.println("                         ,xKKKKKKK0Okkkkkkko;.");
                System.out.println("                        o0KKKKKK0Okkkkkkxl,");
                System.out.println("                      :kKKKKK0OOkkkkkkkxc.");
                System.out.println("'.                   :kKKKKK0OOkkkkkkd:.");
                System.out.println("                    d0KKK0Okkkkkkkko,.");
                System.out.println("    .cdddddd,KK0   OkkkkkKNNkkxc,'");
                System.out.println("     ,lddddxxO0K0OkkkkkkMBHkd:,.");
                System.out.println("       .cddddddxkkkkkkdkkko;.");
                System.out.println("           .:lodddddhkjxkxl,'");
                System.out.println("            ,:lllodddddjhkddjxc.");
                System.out.println("          .:lMNcckhcclddhjjhhdcddc.");
                System.out.println("         .:ll:dkhldds`lijblkkddddd:");
                System.out.println(".cll;lcjvvhBlllhdkd;;'          ");
                System.out.println(":xdddddldddcchkbb';`");
                System.out.println("     .;odddddjkkhcdh");
                System.out.println("        .;oddjljjddllc");
                System.out.println("             .;oddbjkhdo,");
                System.out.println("               .;odddhghdl.");
                System.out.println("                   .;oddc.");
                System.out.println("                      ...");
                System.out.println();
                System.out.println();
                System.out.println();
        }

        public void PrintMessageDramborleg() {

                System.out.println(
                                ANSI_BRIYELLOW + "                             .'''''....                      .,;.");
                System.out.println("                             ,cllllolllc;'               .,cok00l.");
                System.out.println("               ....         .;clllllllllooc.       ..,;cldxOOOO0O;");
                System.out.println("           .,cloooooollcc::;:ccccccccccc:cl:,,;:cloddxdddddxOOOO0o.");
                System.out.println("          .cddddddddddddddxxxxxxddddddddddddxxxxddddddddddddkOOO0O,");
                System.out.println("         .:oodddddddddddddddddddddddddddddddddddddddddddddddxOOOO0l");
                System.out.println("         'loddddddddddddddddddddddddddddddddddddddddddddddddxOOOO0x.");
                System.out.println("         ;oodddddddddddddddddddddddddddddddddddddddddddddddddkOOO0k,");
                System.out.println("        .:oodddddddddddddddddddddddddddddddddddddddddddddddddkOOO0O:");
                System.out.println("        .coddddddddddddddddddddddddddddddddddddddddddddddddddxOOOO0l");
                System.out.println("        .loddddddddddddddddddddddddddddddddddddddddddddddddddxOOOO0o.");
                System.out.println("        'loddddddddddddddddddddddddddddddddddddddddddddddddddxOOOO0o.");
                System.out.println("        ,loddddddddddddddddddddddddddddddddddddddddddddddddddxOOOO0o.");
                System.out.println("        ;ooddddddddddddddddddddddddddddddddddddddddddddddddddxOOOO0l.");
                System.out.println("        ;ooddddddddddddddddddddddddddddddddddddddddddddddddddkOOOOOc");
                System.out.println("        ;ooddddddddddddddddddddddddddddddddddddddddddddddddddkOOO0O;");
                System.out.println("        .cloooodddddddddddddddddooooooooooddddddddddddddddddxOOOO0x'");
                System.out.println("         ..',;;::::::::::::::::::::::::::cllooooooddddddddddxOOOO0o.");
                System.out.println("                      .;:::ccccccccccc'   ...';:cloooodddddxkOOO0O;");
                System.out.println("                      .:cllllllllllllc'          .';:loooodxOOOO0d.");
                System.out.println("                      ,cclllllllllloc;.              .';cldkOOOOO:");
                System.out.println("                     .;ccllllllllllo:'.                 .'cxOOOOo.");
                System.out.println("                     .;ccllllllllllo;.                     .:dOk,");
                System.out.println("                     .:ccllllllllllo,.                       .,,");
                System.out.println("                     ':ccllllllllllo,");
                System.out.println("                     ,cccllllllllllo'");
                System.out.println("                     ,ccclllllllllll'");
                System.out.println("                    .;ccclllllllllll'");
                System.out.println("                    .;ccclllllllllll'");
                System.out.println("                    .:ccclllllllllll'");
                System.out.println("                    .:cccllllllllllo'");
                System.out.println("                    .:cccllllllllllo,");
                System.out.println("                    .:cccllllllllllo;.");
                System.out.println("                    .:cccclllllllllo:'.");
                System.out.println("                    .:ccccllllllllloc;.");
                System.out.println("                    .:cccclllllllllllc'");
                System.out.println("                    .;ccccclllllllllll;");
                System.out.println("                     ,cccccllllllllllo:.");
                System.out.println("                     'cccccclllllllllll'");
                System.out.println("                     .:cccccclllllllc:l:.");
                System.out.println("                     .;ccccccclllllcc:cl,");
                System.out.println("                      .:cccccccllllcccclc.");
                System.out.println("                      .,ccccccccllccccccl;.");
                System.out.println("                       .;ccccccccccccccccl;");
                System.out.println("                        .;ccccccccccccccccl,");
                System.out.println("                         .,:ccccccccccccccc;.");
                System.out.println("                           .;:cccccccccc:,.");
                System.out.println("                             ..',,,,''..");
                System.out.println();
        }

        public void PrintPlatemail() {

                System.out.println(ANSI_GREY + "                                .;;.");
                System.out.println("                              .kNNK:");
                System.out.println("                            .cdddkOx;.");
                System.out.println("                          ,ooc.    'ldo;");
                System.out.println("                        .od;;,        'dl.");
                System.out.println("                        od.,xl'..      ,k;");
                System.out.println("                       .kOooxxxddxc. . .xl");
                System.out.println("                      ,dol:;:::::clcccccdk:");
                System.out.println("                      ;k,               ;kc");
                System.out.println("                       ;x;           .'ld,");
                System.out.println("                        'odc,'...,:lod0x.");
                System.out.println("                          ;OXkddool:..:d,..");
                System.out.println("            ..           .:Ox.         ckk0x,");
                System.out.println("           ,xOkddol:'..;xkO0;     ..:lldxkdloolc;:cclllkOdod'");
                System.out.println("          .xxdl..',cxdlc:lollcccllooxxxxd;.  .cOd;'..,loodOX:");
                System.out.println("          .xll:   .ll.   .;c:loddollloc'     ,x:   .co:cd0WO.");
                System.out.println("           okcl'  :x'       .',,''..        .xl   'oc:do.lXc");
                System.out.println("           lNxcl'.oo                        ;0;  ;o;cx:..dK:");
                System.out.println("           lKOxolo0c                        :K: :l;od;:lcOK,");
                System.out.println("           ;OocxkkKc                        ,0d:l:xdcl:. dO.");
                System.out.println("           .O0cclxKl                         oXkcxkoc..'cOx.");
                System.out.println("           .xo.,:cOd                         .OXKXk;.;c;'oO,");
                System.out.println("           ;Oo,...dO'                         ,0MXo;:,',;l0l");
                System.out.println("           ox..,,,c0l                          cNXd,,;;,..ok.");
                System.out.println("          .xx;,'...dO'                         oNXd:;.';:lO0;");
                System.out.println("         .c0o..,;,,dNx.                       .Okk0:';;:odxK0c");
                System.out.println("        .dKK0l'''';k00o.                      cOk00kl;:ooc:xXXk'");
                System.out.println("         l0kOkc,:oOKOO0o                     'x:,O0dxOkoooldk0Nl");
                System.out.println("        .lxKklxOOOkddOcc0xc,.       ......,;:lk0: .dx:ckkxkdc;oKc");
                System.out.println("        ,0Oxxdxdc;':kl.lkc:lloxOOxkkxk0KKK00OdldOc .dkoxxl:.  lO'");
                System.out.println("        'Od';oxxo,,dc .dN0kdlc:cdkXXll0XKo;::::;oOc.l0oc,    .xd ");
                System.out.println("        .xo  .,cod0o  ,xl:oKNkddl:;clok0Xx::;;;;cxKKX0,      ;O:");
                System.out.println("        lx.    'lKd .xk;,oXk.:NNOdl;'';dd:....:0XkkXk.      ok.");
                System.out.println("        ,k;     .kl ck,.:KN: oMO,oMXxol,.;lkx:'lkllOO,     'Ol");
                System.out.println("        .dl     ;x,'Od,,dNk..kMd.cW0;.:kkl,';:cd0xcdKl     ck'");
                System.out.println("         :x.    oo.ok. ,0Nc ;KWl :NK,  :XXxoc,;oKOl:kk.   'xl");
                System.out.println("         'x:   ,x;,Oo,,dWO. lWX; ;XX;  .OXOk0Kkx0K0OXXo:ccxO,");
                System.out.println("         .kkccckx.ox. 'OXl .xMk. ,KWc  .oNXxoOK0kk0dkO;.  ;0c");
                System.out.println("         ,d;...ckd0x;:xOd, ,0No  '0Md.  ;O0dlool:o0do:    .xk.");
                System.out.println("         ll     :KO,.cOOl. :Ox;  .kMk;. .lOk:'',,;xXo.     c0;");
                System.out.println("        .d:     .OO;;xkd, .dko'   oWOl.  :xOo,',;'lk;      'k:");
                System.out.println("        ,d;.    ,0l ,Okl:;lxxc... ;KKklll:lOOc,,,,odo,     .oc");
                System.out.println("        .l00xcc;o0o,lkxox0Kxl,.oOc,oOXkO0:,lOx;;;:kOkl;ccclxO:");
                System.out.println("          ;OX0OxkKd::kOdddkkoc,oOdccxXx:,;:o00xkkkOKKcckO0KNd.");
                System.out.println("            ,llodONKxxxxxOOOkxccoodxk00xlodl,''... :0Okx0N0l.");
                System.out.println("                 .Od   .;l,.'oxddxo,..'lkk;        .oX0od0l");
                System.out.println("                 '0l         .OKo'      lO'         ,K0, cx.");
                System.out.println("                 '0l         :Kc        ,0c         :XXc 'kc");
                System.out.println("                 .Oo        .xk.        .dk.        oOkk. ox.");
                System.out.println("                 .kd        ;0c          ;0l  .,;,..xo;Oc ,k;");
                System.out.println("                  ok,,;;cc,.dk.           oOc:odoodkKc ok..xo");
                System.out.println("                 .dxll:;loloKo            :XKdcll:lkKd.'Oc ck.");
                System.out.println("                 ;kc:lccolccOx.           oOdlcldkO0Xk. ok.'k:");
                System.out.println("                 :Ol,,,:ccloOd.          .od;,...,:lkk. ,Oc oo");
                System.out.println("                 :Od,.   .;d0o            lkc'.   .:xO,  dk.:k'");
                System.out.println("                 o0oollcc:::xx.           o0kxol::oxdkd. ,Oc'x:");
                System.out.println("                 dXklclc:::ckk.           :Kkooddc:oodO;  ox.od");
                System.out.println("                 :kllooddoldKd.           .kKocodoccokO,  ,k:;x.");
                System.out.println("                 .xxoo::odlkK:             oKdooc::l;:k;   dd,d:");
                System.out.println("                 .xd,::cc,.lk.             :0:.cl:;. ;k,   ;O:cl");
                System.out.println("                  cO'     .ko              .dx. .    :x.    dd:o'");
                System.out.println("                  .ko     :0;               'kl      dd     ;klo:");
                System.out.println("                   lk.    dk.                ;k,    .kc     .dxol");
                System.out.println("                   ;x,   .dd.                 co.   ;k;      ;Oko");
                System.out.println("                   ,xc'.  ok.                 'dc;:':x'       l0k,");
                System.out.println("                   ckl:;;;d0;                 :ko:clkk'       .dKc");
                System.out.println("                 'cl:;::;,;xx'                dx,,,,l0o        .;'");
                System.out.println("               .lOd:;,',;::,ok.               :x:,,;cOO.");
                System.out.println("             .oxolclc;;:,.okxl.              .lxl:;;:ckd.");
                System.out.println("            :dl:;'.'c;.,ddl;.               .l:',,,,,'c0d.");
                System.out.println("           ;Oklclollodoc,.                  cx. .','...lK;");
                System.out.println("            .'',,,,''.                      .cdl;'.;dOkxl");
                System.out.println("                                              .,cloxdc'.");
                System.out.println("                                                  .");
                System.out.println();
        }

        public void PrintChainmail() {

                System.out.println(ANSI_GREY + "                               .',,;;:;,,,'.");
                System.out.println("                          .';clollllllcllc;'.");
                System.out.println("                         .:cccllloclllllllcc;'.");
                System.out.println("                        ':ccllllolcclllllccc::,.");
                System.out.println("                       ':clclcclolodolodoccc:;;'");
                System.out.println("                      .;c:clodO000KXXXXXKOxoc;;:'");
                System.out.println("                      ,cclxOKNWNNNNNNNNNNNNKkoc:;.");
                System.out.println("                     .;ccdKWNNN" + ANSI_BLACK + "XXXXXXXXXX" + ANSI_GREY
                                + "NNNNKd:;.");
                System.out.println("                     .:::dXWNN" + ANSI_BLACK + "XXXKKKKKKKKXX" + ANSI_GREY
                                + "NNXd:;,.");
                System.out.println("                     ':::dKN" + ANSI_BLACK + "XXXKKKKKKKKKKKK" + ANSI_GREY
                                + "XNKo:::.");
                System.out.println("                     ,:c:l0NN" + ANSI_BLACK + "XXKKKKKKKKKKKK" + ANSI_GREY
                                + "NN0l;:;.");
                System.out.println("                    .;llclONN" + ANSI_BLACK + "XXKKKKKKKKKKKX" + ANSI_GREY
                                + "NN0oc:'.");
                System.out.println("                    .:ccllkNNN" + ANSI_BLACK + "XXKKKKKKKKKXX" + ANSI_GREY
                                + "NXOl::;.");
                System.out.println("                    'clllldKNN" + ANSI_BLACK + "XXXKKKKKKKKX" + ANSI_GREY
                                + "NNKdc::;'");
                System.out.println("                    ,cllllokXNN" + ANSI_BLACK + "XXXXXXXXXX" + ANSI_GREY
                                + "NNN0dcc:;.");
                System.out.println("                    ,cldollxKNNNNN" + ANSI_BLACK + "XXXXX" + ANSI_GREY
                                + "NNNNKxlccc;.");
                System.out.println("                  .';clooood" + ANSI_BLACK + "ONWNNNNNNNNNNNK" + ANSI_GREY
                                + "Odllc:;'.");
                System.out.println("                 'oo:cooodddx" + ANSI_BLACK + "0NNNNNNNNNNNX" + ANSI_GREY
                                + "Oxdooc::,;;.");
                System.out.println("            ...,::loccooodxxdx" + ANSI_BLACK + "0XWNNNNNNNX0" + ANSI_GREY
                                + "kxdolcc:;::::;,..");
                System.out.println("        .',;clcldlclccoddxdxxxx" + ANSI_BLACK + "OKNNNWWNKO" + ANSI_GREY
                                + "xdddoolc;;cllolcl:;'..");
                System.out.println("      .,:lollodxxoc:cloddddxxxxxx" + ANSI_BLACK + "OXNK0O" + ANSI_GREY
                                + "kxxxxdollc;:ldooollc:cc;'.");
                System.out.println("    .,cclllloddxddolllodxxxxxxxxxxkxolodxxdddoooc;:lolclllllc::::,.");
                System.out.println("    ':cccllooooddddddodddxxxkxxxkxdoloododddddool:clllllollc::c::;,.");
                System.out.println("     ,ccccclloooddddddoddddxkxdxdddoldoooooodolllcllloollolclc:;;,,,.");
                System.out.println("      .;ccllooooodddddooooodxdxxdooooooddddoollollloollclllclccc:;,'.");
                System.out.println("       .,clloooollloooooooooddddoooloxxddddolloooooooollooclllcc:'.");
                System.out.println("         .;clloooolllooooddoodxdoooloddddodoooloooooooooocc::c:;'.");
                System.out.println("           .:lllooooolooloddddddddoldddddollollloooooooolccc:;..");
                System.out.println("             'cooooollooocloloodddocoxddoooollllloooooodolc:,.");
                System.out.println("              .,llllloollllooooooolcloloooololloloolooool:,.");
                System.out.println("                'clcloollooooloooolloolloollollllooloolo:.");
                System.out.println("                 ..;llllooddoooooooooddoooollllllolooc,.");
                System.out.println("                    ':looddoooddooooooddodoolloool:,.");
                System.out.println("                     .,loodoloooolloddddoddoool:;'.");
                System.out.println("                       .'coolllooolodooooddod:'.");
                System.out.println("                          .,:oddooddddddddl;'");
                System.out.println("                            .,odoxxddddlc,.");
                System.out.println("                              .';odoc,'.");
                System.out.println("                                 .;,");
                System.out.println();
        }

        public void PrintLeather() {

                System.out.println(ANSI_BROWN + "            .  .                         , ");
                System.out.println("              ....'',,',;,.                 ..'.........");
                System.out.println("            ,;,,,,,,,,,,',;;,....         ..;;;;,,,,,,'.....");
                System.out.println("          ..:dl,,,,,,'.  .,;:;;;'...',,,,'';c:;,,,,,,,,,,;cc.");
                System.out.println("       .cc;;,cd:.'','.   .,;cc::c' .,,::;;;cl;,,,,,,,,,,;ox:,...");
                System.out.println("       .ckkl;,ldc,,,'.  .,cxOo;ckl  ';x0o;;o0Oo:,,,,,,,;d0l;:oxl.");
                System.out.println("      .,lxOOxl:oxl;,,',cxO00d::x0l  ..dXOl;cxKX0xl:,,,;d0o;lkxl;.");
                System.out.println("     .okkdddkOxcoOkoox0XKOdc;,lxOl   .oKkc,,:lx0KX0xocd0dcdxl;;;;,.");
                System.out.println("     .:dxdxdodO00KNNNX0kxl;,,;clxc   .oXkl,,,,:oxk0XNNNKkdo::coddo'");
                System.out.println("    'c:;,:x000KNMMN0Okkko:,,,,:x0c   .oXkc,,,,,,:oxkOKXWXO00Odlc;'.");
                System.out.println("   .:xxxdoOKXMMMWXOkkkkkd:;:;,:o0c   .oXd:,;;,,,,;ldkkkKWMMKxl;:cl:.");
                System.out.println(" .,,,cdk0XWNWMMXOkkkkxxo;:dd:;lOc..  cOo:oxl,,;;;,cdkk0XMMWX0kxxdd,");
                System.out.println(" .,;;clo0WKxKMWXOkOkkOkxxddxdddl,:l. 'ldoxkdodko;;:cdkkXMNXWN0Ox;,'.");
                System.out.println("    ....'xXXWWKO0KKK00kdol:;;cc:;;;'.';::;;codxdxkkkO00NWo:00oodlc:'");
                System.out.println("          .:ONWK0OOOkkxollolllc:;,,.. .';:clllcclodxkkO0Xkcxd.  ....");
                System.out.println("             ;kNX0kOXKocllcc;,,,,,,,,,,,,,,;;::ccdOOOOO0XXKd.");
                System.out.println("              'OKkxOXKl;;:::;,,,,,,,,,,,,,,,,,,,;d0kxkxO0d'");
                System.out.println("               oKOxkK0c,;:::;;;,,,,,,,,,,,,,,,,,;dKOxkkx;");
                System.out.println("               ;00xkKKl,;;::;,,,,,,,,,,,,,,,,,,;;xKkxkOo.");
                System.out.println("               .dOxk0Xx;,;;;;;;;::::::::::;;;,;;cO0kkkk:");
                System.out.println("               'OKOkk0Kxloodxkxxddddxxxddxxdooodk0Oxkkx'");
                System.out.println("               .dXKkkk0X0O000kdl::::::::clodxOOKKOkkkOx.");
                System.out.println("                'OWKkkKXxdxkxxxlccc:clc::oxxxxd0Odkkxko.");
                System.out.println("                'OWXkx0Xkdxkxxo::loldkxxdddxxxxKOdxkkkd.");
                System.out.println("                .xWNOxOKkolcll:;,;;:clllc;;cooxK0xkkkkx'");
                System.out.println("                .dNNOkk0Oocol:::cloddxdlc::clco00kkkkkd.");
                System.out.println("                cKWW0kkkO0OOOkOOOOOOkxxkOOO0OkOKOxkkkOO;");
                System.out.println("                cKWN0kkkkK0OOkkkxkdcclldxkkkk0KddxkkkO0;");
                System.out.println("                .oXXOkkx0KxxkkkkkkdoxkkkkkkxdOkcokkkkkl.");
                System.out.println("                 lNN0kkk0XkdkkkkxdlodddddodddOd:lxkkkkc.");
                System.out.println("                 .;ccccccooclolc;'.....'',;clc,'',,,'.");
                System.out.println();

        }

        public void WelcomeMessage() {

                System.out.println(ANSI_BRIGREEN + "  _   _   _   _     _   _   _   _   _   _   _   _   _");
                System.out.println(" / \\ / \\ / \\ / \\   / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\");
                System.out.println("( " + ANSI_BRIRED + "L" + ANSI_BRIGREEN + " | " + ANSI_BRIRED + "O" + ANSI_BRIGREEN
                                + " | " + ANSI_BRIRED + "T" + ANSI_BRIGREEN + " | " + ANSI_BRIRED + "R" + ANSI_BRIGREEN
                                + " ) ( " + ANSI_BRIRED + "S" + ANSI_BRIGREEN + " | " + ANSI_BRIRED + "i"
                                + ANSI_BRIGREEN + " | " + ANSI_BRIRED + "m" + ANSI_BRIGREEN + " | " + ANSI_BRIRED + "u"
                                + ANSI_BRIGREEN + " | " + ANSI_BRIRED + "l" + ANSI_BRIGREEN + " | " + ANSI_BRIRED + "a"
                                + ANSI_BRIGREEN + " | " + ANSI_BRIRED + "t" + ANSI_BRIGREEN + " | " + ANSI_BRIRED + "o"
                                + ANSI_BRIGREEN + " | " + ANSI_BRIRED + "r" + ANSI_BRIGREEN + " )");
                System.out.println(
                                " \\_/ \\_/ \\_/ \\_/   \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/" + ANSI_BRIYELLOW);
                System.out.println();
        }

        public void PrintGameTypeChoices() {
                System.out.println(
                                "Welcome to the Lord of the Rings. Choose a hero and find yourself in battle! Good luck adventurer!");
                System.out.println("Enter 1 to start new game, or Enter 2 Continue previous game");
        }

        public void PrintWarriorChoices() {
                System.out.println("Choose your hero:");
                int rowToPrint = 0; // warrior row
                for (int col = 0; col < menus[rowToPrint].length; col++) {
                        System.out.println(col + 1 + ") " + menus[rowToPrint][col]);
                }
        }

        public void PrintArmourChoices() {
                System.out.println("Pick your armour:");
                int rowToPrint = 1; // armour row
                for (int col = 0; col < menus[rowToPrint].length; col++) {
                        System.out.println(col + 1 + ") " + menus[rowToPrint][col]);
                }
        }

        public void PrintWeaponChoices() {
                System.out.println("Pick your weapon:");
                int rowToPrint = 2; // weapon row
                for (int col = 0; col < menus[rowToPrint].length; col++) {
                        System.out.println(col + 1 + ") " + menus[rowToPrint][col]);
                }
        }

        public void PrintStartingStats(Warrior pWarrior, Warrior eWarrior) {
                System.out.println(ANSI_GOLD + "You have: " + pWarrior.GetHealth() + " health.");
                System.out.println(ANSI_BRIRED + "Your enemy has: " + eWarrior.GetHealth() + " health.");
        }

        public void PrintAttackTypes() {
                System.out.println(ANSI_BRIGREEN + "Choose an attack: ");
                System.out.println(ANSI_BRIGREEN
                                + "Enter 1 for a basic attack with a chance of a critical hit \n2 for a heavy attack \n3 Cast a spell\n4 to save your game\n5 Surrender");
        }

        public void PrintMissMessage(boolean isPlayer) {
                if (isPlayer) {
                        System.out.println(ANSI_GOLD + "You miss!");
                } else {
                        System.out.println(ANSI_BRIRED + "Enemy misses!");
                }
        }

        public void PrintHitMessage(boolean isPlayer, int damage) {
                if (isPlayer) {
                        System.out.println(ANSI_GOLD + "You hit for: " + damage + " points!");
                } else {
                        System.out.println(ANSI_BRIRED + "Enemy hits for: " + damage + " points!");
                }
        }

        public void PrintPlayerHealth(int health) {
                System.out.println(ANSI_GOLD + "Your health is: " + health);
        }

        public void PrintComputerHealth(int health) {
                System.out.println(ANSI_BRIRED + "The enemies health is: " + health);
        }

        public void PrintPlayerWon() {
                System.out.println(ANSI_GOLD
                                + "You defeated the computer! Do you wish to play again? Press 1 to play again or 2 to quit.");
        }

        public void PrintComputerWon() {
                System.out.println(ANSI_BRIRED
                                + "The computer defeated you! Do you wish to play again? Press 1 to play again or 2 to quit.");
        }

}