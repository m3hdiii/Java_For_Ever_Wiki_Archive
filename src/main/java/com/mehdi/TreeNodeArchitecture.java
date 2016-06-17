package com.mehdi;

import java.util.ArrayList;

/**
 * @author Mehdi Afsari Kashi
 * @version 1.0.0
 * @since 1.0.0
 * Creation Date: 2016/06/9
 */
public class TreeNodeArchitecture {

    public TreeNode get() {
        TreeNode rootNode = new TreeNode("JAVA 4 Ever", new ArrayList<TreeNode>());

        TreeNode javaBooks = new TreeNode("Java Books", new ArrayList<TreeNode>() {{
            add(new TreeNode("Java", new ArrayList<TreeNode>()) {{
                add(new TreeNode("#Java_Tutorial", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_data_structure", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_algorithm", new ArrayList<TreeNode>()));
                add(new TreeNode("#javafx_book", new ArrayList<TreeNode>()));
                add(new TreeNode("#JVM_Principles", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_performance", new ArrayList<TreeNode>()));
            }});

            add(new TreeNode("Software Engineering", new ArrayList<TreeNode>()) {{
                add(new TreeNode("#refactoring_solutions", new ArrayList<TreeNode>()));
                add(new TreeNode("#Clean_Code", new ArrayList<TreeNode>()));
            }});

            add(new TreeNode("Other", new ArrayList<TreeNode>()) {{
                add(new TreeNode("#microsoft_computer_dictionary", new ArrayList<TreeNode>()));
            }});
        }});


        TreeNode javaDocuments = new TreeNode("Java Wiki QA", new ArrayList<TreeNode>() {{
            add(new TreeNode("Start With Java", new ArrayList<TreeNode>()) {{
                add(new TreeNode("#why_java", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_how_to_start", new ArrayList<TreeNode>()));
                add(new TreeNode("#start_learning_java", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_installation_on_ubuntu", new ArrayList<TreeNode>()));
                add(new TreeNode("#Java_Home_Linux", new ArrayList<TreeNode>()));
                add(new TreeNode("#Java_Home_Problem_Windows", new ArrayList<TreeNode>()));
                add(new TreeNode("#Java_Launch_App_Mechanism", new ArrayList<TreeNode>()));
                add(new TreeNode("#Java_Run_App_Command", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_running_problem", new ArrayList<TreeNode>()));
                add(new TreeNode("#NETBEANS_VS_ECLIPSE", new ArrayList<TreeNode>()));
            }});

            add(new TreeNode("Java Keyboards", new ArrayList<TreeNode>()) {{
                add(new TreeNode("#Java_This_Keyboard", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_final_keyword", new ArrayList<TreeNode>()));
                add(new TreeNode("#if_condition", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_foreach_loop", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_iterables", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_transient_keyboard", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_volatile_keyboard", new ArrayList<TreeNode>()));
            }});

            add(new TreeNode("Java Concepts", new ArrayList<TreeNode>()) {{
                add(new TreeNode("#java_anonymous_class", new ArrayList<TreeNode>()));
                add(new TreeNode("#Java_Why_Interface_Hierarchy", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_serialization", new ArrayList<TreeNode>()));
                add(new TreeNode("#Java_Exception_Handling", new ArrayList<TreeNode>()));
                add(new TreeNode("#Exception_Handling_Mechanism", new ArrayList<TreeNode>()));
                add(new TreeNode("#Java_Getter_Setter", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_interface", new ArrayList<TreeNode>()));
                add(new TreeNode("#interface", new ArrayList<TreeNode>()));
                add(new TreeNode("#interface_and_abstract", new ArrayList<TreeNode>()));
                add(new TreeNode("#interface_vs_abstract", new ArrayList<TreeNode>()));
                add(new TreeNode("#recursive_call", new ArrayList<TreeNode>()));
                add(new TreeNode("#Anonymous_inner_class", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_garbage_collection", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_8_lambda", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_8_stream_api", new ArrayList<TreeNode>()));
                add(new TreeNode("#Java_JVM", new ArrayList<TreeNode>()));
                add(new TreeNode("#Java_Semaphores", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_jdbc_connection", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_database_connection", new ArrayList<TreeNode>()));
                add(new TreeNode("#Java_Constructor_Feed", new ArrayList<TreeNode>()));
                add(new TreeNode("#Java_Runnable_Interface", new ArrayList<TreeNode>()));

            }});

            add(new TreeNode("Coding QA", new ArrayList<TreeNode>()) {{
                add(new TreeNode("#java_BigInteger", new ArrayList<TreeNode>()));
                add(new TreeNode("#Java_Bitwise_Operators", new ArrayList<TreeNode>()));
                add(new TreeNode("#oracle_jdbc_connection_example", new ArrayList<TreeNode>()));
                add(new TreeNode("#string_number_conversion", new ArrayList<TreeNode>()));
                add(new TreeNode("#BigInteger_Bitwise_Operator", new ArrayList<TreeNode>()));
                add(new TreeNode("#remove_elements_while_loop_problem", new ArrayList<TreeNode>()));
                add(new TreeNode("#SwingUtilities", new ArrayList<TreeNode>()));
                add(new TreeNode("#JFrame_Background", new ArrayList<TreeNode>()));
                add(new TreeNode("#JPanel_Background", new ArrayList<TreeNode>()));
                add(new TreeNode("#Classes_Which_Implement_One_Interface", new ArrayList<TreeNode>()));
                add(new TreeNode("#Annotation_Scanning", new ArrayList<TreeNode>()));
            }});

            add(new TreeNode("Android QA", new ArrayList<TreeNode>()) {{
                add(new TreeNode("#how_build_and_run_androidApp_faster", new ArrayList<TreeNode>()));
            }});

            add(new TreeNode("relating topics", new ArrayList<TreeNode>()) {{
                add(new TreeNode("#Java_Windows_Installer", new ArrayList<TreeNode>()));
                add(new TreeNode("#maven_concept", new ArrayList<TreeNode>()));
            }});
        }});

        TreeNode javaWeb = new TreeNode("Java Web", new ArrayList<TreeNode>() {{
            add(new TreeNode("#How_To_Create_Web_Project", new ArrayList<TreeNode>()));
            add(new TreeNode("#Migrate_From_Asp_To_Jsp", new ArrayList<TreeNode>()));
            add(new TreeNode("#Java_Web_Filters", new ArrayList<TreeNode>()));
            add(new TreeNode("#JSP_Multipart_Form", new ArrayList<TreeNode>()));
            add(new TreeNode("#JSP_Parameter_Fetch_Problem", new ArrayList<TreeNode>()));
            add(new TreeNode("#Java_Web_VS_PHP", new ArrayList<TreeNode>()));
            add(new TreeNode("#why_jstl", new ArrayList<TreeNode>()));
        }});

        TreeNode oop = new TreeNode("OOP", new ArrayList<TreeNode>() {{
            add(new TreeNode("#composition_vs_aggregation", new ArrayList<TreeNode>()));
            add(new TreeNode("#composition_vs_inheritance", new ArrayList<TreeNode>()));
            add(new TreeNode("#strategy_design_pattern", new ArrayList<TreeNode>()));
        }});


        TreeNode javaSecurity = new TreeNode("Java Security", new ArrayList<TreeNode>() {{
            add(new TreeNode("#java_decompilation_protection", new ArrayList<TreeNode>()));
            add(new TreeNode("#java_class_obfuscation", new ArrayList<TreeNode>()));
            add(new TreeNode("#online_services_for_android_apps", new ArrayList<TreeNode>()));
            add(new TreeNode("#secure_web_application", new ArrayList<TreeNode>()));
            add(new TreeNode("#CROSS_DEPENDENCY_SECURITY", new ArrayList<TreeNode>()));
            add(new TreeNode("#WHY_OAUTH", new ArrayList<TreeNode>()));
        }});

        TreeNode migrations = new TreeNode("Migrations", new ArrayList<TreeNode>() {{
            add(new TreeNode("#Move_From_JavaSE_To_JavaEE", new ArrayList<TreeNode>()));
            add(new TreeNode("#Migrate_From_Asp_To_Jsp", new ArrayList<TreeNode>()));
            add(new TreeNode("#migrate_to_maven", new ArrayList<TreeNode>()));
            add(new TreeNode("#Java8", new ArrayList<TreeNode>()));
            add(new TreeNode("#port_to_java_8", new ArrayList<TreeNode>()));
        }});

        TreeNode javaFrameworks = new TreeNode("Java Frameworks", new ArrayList<TreeNode>() {{
            add(new TreeNode("Spring Framework", new ArrayList<TreeNode>() {{
                add(new TreeNode("#why_spring_mvc", new ArrayList<TreeNode>()));
            }}));

            add(new TreeNode("JSF Framework", new ArrayList<TreeNode>() {{
                add(new TreeNode("#Why_Not_JSF", new ArrayList<TreeNode>()));
            }}));
        }});

        TreeNode javaTools = new TreeNode("Java Tools", new ArrayList<TreeNode>() {{
            add(new TreeNode("Profilers", new ArrayList<TreeNode>() {{
                add(new TreeNode("#yourkit_profiler", new ArrayList<TreeNode>()));
                add(new TreeNode("#Java_Profilers", new ArrayList<TreeNode>()));
                add(new TreeNode("#java_profiler", new ArrayList<TreeNode>()));
            }}));

            add(new TreeNode("Maven", new ArrayList<TreeNode>() {{
                add(new TreeNode("#migrate_to_maven", new ArrayList<TreeNode>()));
                add(new TreeNode("#maven_concept", new ArrayList<TreeNode>()));
            }}));

            add(new TreeNode("Eclipse", new ArrayList<TreeNode>() {{
                add(new TreeNode("#eclipse_dark_theme", new ArrayList<TreeNode>()));
            }}));

            add(new TreeNode("IntelliJ Idea", new ArrayList<TreeNode>() {{
                add(new TreeNode("#intellij_idea_2016", new ArrayList<TreeNode>()));
                add(new TreeNode("#Intellij_Idea_Cracks", new ArrayList<TreeNode>()));
            }}));

            add(new TreeNode("Oracle", new ArrayList<TreeNode>() {{
                add(new TreeNode("#oracle_jdbc_collection", new ArrayList<TreeNode>()));
                add(new TreeNode("#ojdbc_collection", new ArrayList<TreeNode>()));
            }}));

            add(new TreeNode("Weblogic", new ArrayList<TreeNode>() {{
                add(new TreeNode("#weblogic_full_docs", new ArrayList<TreeNode>()));
                add(new TreeNode("#weblogic_1221", new ArrayList<TreeNode>()));
            }}));

            add(new TreeNode("VirtualBox", new ArrayList<TreeNode>() {{
                add(new TreeNode("#virtual_box_mount_and_share_folder", new ArrayList<TreeNode>()));
            }}));
        }});

        TreeNode crossLanguages = new TreeNode("Cross Languages", new ArrayList<TreeNode>() {{
            add(new TreeNode("#Programming_Languages_Comparison", new ArrayList<TreeNode>()));
            add(new TreeNode("#Which_Programming_Language", new ArrayList<TreeNode>()));
            add(new TreeNode("#What_Programming_Language", new ArrayList<TreeNode>()));
            add(new TreeNode("#97_things_every_programmer_should_know", new ArrayList<TreeNode>()));
        }});

        TreeNode javaLibraries = new TreeNode("Java Libraries", new ArrayList<TreeNode>() {{
            add(new TreeNode("#getdown_library", new ArrayList<TreeNode>()));
            add(new TreeNode("#Graph_Libraries", new ArrayList<TreeNode>()));
            add(new TreeNode("#JSoup_Library", new ArrayList<TreeNode>()));
            add(new TreeNode("#Java_Network_Sniff_Libraries", new ArrayList<TreeNode>()));
        }});

        TreeNode wellKnownPeople = new TreeNode("Well known People", new ArrayList<TreeNode>() {{
            add(new TreeNode("#martin_fowler", new ArrayList<TreeNode>()));
            add(new TreeNode("#kent_beck", new ArrayList<TreeNode>()));
            add(new TreeNode("#john_brant", new ArrayList<TreeNode>()));
            add(new TreeNode("#don_roberts", new ArrayList<TreeNode>()));
            add(new TreeNode("#william_opdyke", new ArrayList<TreeNode>()));
            add(new TreeNode("#Uncle_Bob", new ArrayList<TreeNode>()));
            add(new TreeNode("#Arun_Gupta", new ArrayList<TreeNode>()));
            add(new TreeNode("#Dennis_Ritchie", new ArrayList<TreeNode>()));
            add(new TreeNode("#Ken_Thompson", new ArrayList<TreeNode>()));
            add(new TreeNode("#Maurice_Naftalin", new ArrayList<TreeNode>()));
        }});

        TreeNode bigData = new TreeNode("Big Data", new ArrayList<TreeNode>() {{
            add(new TreeNode("#big_data_workshop", new ArrayList<TreeNode>()));
        }});

        TreeNode magazines = new TreeNode("Magazines", new ArrayList<TreeNode>() {{
            add(new TreeNode("#java_magazine_2014", new ArrayList<TreeNode>()));
            add(new TreeNode("#java_magazine_2015", new ArrayList<TreeNode>()));
            add(new TreeNode("#java_magazine_2016", new ArrayList<TreeNode>()));
            add(new TreeNode("#Java_9_and_Beyond", new ArrayList<TreeNode>()));
        }});

        TreeNode videos = new TreeNode("Videos", new ArrayList<TreeNode>() {{
            add(new TreeNode("#Create_Strong_Team", new ArrayList<TreeNode>()));
            add(new TreeNode("#Java_Fun", new ArrayList<TreeNode>()));
            add(new TreeNode("#micro_services", new ArrayList<TreeNode>()));
            add(new TreeNode("#Medal_Of_Science", new ArrayList<TreeNode>()));
            add(new TreeNode("#Java8", new ArrayList<TreeNode>()));
            add(new TreeNode("#port_to_java_8", new ArrayList<TreeNode>()));
            add(new TreeNode("#JVM_Architecture", new ArrayList<TreeNode>()));
            add(new TreeNode("#java_memory_usage_concepts", new ArrayList<TreeNode>()));
            add(new TreeNode("#JavaOne_Keynote_Conference_2015", new ArrayList<TreeNode>()));
            add(new TreeNode("#OAUTH2", new ArrayList<TreeNode>()));
        }});

        TreeNode generalDiscussion = new TreeNode("General Discussion", new ArrayList<TreeNode>() {{
            add(new TreeNode("#regex", new ArrayList<TreeNode>()));
            add(new TreeNode("#learn_regex", new ArrayList<TreeNode>()));
        }});

//        TreeNode persianQA = new TreeNode("Persian Subjects", new ArrayList<TreeNode>() {{
//            add(new TreeNode("#مطلب", new ArrayList<TreeNode>()));
//            add(new TreeNode("#سوال", new ArrayList<TreeNode>()));
//            add(new TreeNode("#فراخوان_مسابقات_برنامه_نویسی", new ArrayList<TreeNode>()));
//
//
//        }});


        TreeNode nodes[] = new TreeNode[]{javaBooks, javaDocuments, javaWeb, oop, javaSecurity, migrations, javaFrameworks,
                javaTools, crossLanguages, javaLibraries, wellKnownPeople, bigData,
                magazines, videos, generalDiscussion, /*persianQA*/};

        for (TreeNode node : nodes) {
            rootNode.add(node);
        }

        return rootNode;
    }
}
