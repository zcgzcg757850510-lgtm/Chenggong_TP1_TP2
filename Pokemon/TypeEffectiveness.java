import java.util.HashMap;
import java.util.Map;

       // 类型相克关系表
public class TypeEffectiveness {
    
        
    private static final Map<String, Double> TYPE_CHART = new HashMap<>();

    static {
        // 基本的类型相克关系 - 简化版
        TYPE_CHART.put("eau:feu", 2.0);          // 水克火
        TYPE_CHART.put("feu:plante", 2.0);       // 火克草
        TYPE_CHART.put("plante:eau", 2.0);       // 草克水
        TYPE_CHART.put("electrique:eau", 2.0);   // 电克水
        
        // 反向克制关系
        TYPE_CHART.put("feu:eau", 0.5);          // 火被水克
        TYPE_CHART.put("eau:plante", 0.5);       // 水被草克
        TYPE_CHART.put("plante:feu", 0.5);       // 草被火克
    }

      // 从映射表中获取倍率，如果没有找到则返回1.0（普通效果）
    public static double calculerMultiplicateur(String typeAttaquant, String typeDefenseur) {

        String attaquant = typeAttaquant.toLowerCase().trim();
        String defenseur = typeDefenseur.toLowerCase().trim();
        String key = attaquant + ":" + defenseur;   
        return TYPE_CHART.getOrDefault(key, 1.0);
    }
    
    public static String getDescriptionEfficacite(double multiplicateur) {
        if (multiplicateur >= 2.0) {
            return "C'est super efficace!";
        } else if (multiplicateur > 1.0) {
            return "C'est efficace!";
        } else if (multiplicateur == 1.0) {
            return "Dégâts normaux.";
        } else if (multiplicateur > 0.0) {
            return "Ce n'est pas très efficace...";
        } else {
            return "Ça n'a aucun effet!";
        }
    }
}
