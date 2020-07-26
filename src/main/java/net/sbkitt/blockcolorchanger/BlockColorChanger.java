package net.sbkitt.blockcolorchanger;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

import static org.bukkit.Bukkit.broadcastMessage;

public final class BlockColorChanger extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("plugin is Enabled");

    }
    @Override
    public void onDisable() {
        getLogger().info("plugin is Enabled");
    }

    @EventHandler
    public void Interact(PlayerInteractEvent event) {
        //利き手を選択
        EquipmentSlot e = event.getHand();
        //聞き手で実行されているか?
        if (Objects.requireNonNull(e).equals(EquipmentSlot.HAND)) {
            //手持ちのアイテムを取得
            ItemStack i = event.getPlayer().getInventory().getItemInMainHand();
            //クリックしたブロックを取得
            Block b = event.getClickedBlock();
            if (b == null) {
                return;
            }
            //ブロックに対する右クリックか?
            if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
                //染料を持っているか?
                if (i.getType() == Material.BLACK_DYE || i.getType() == Material.BLUE_DYE || i.getType() == Material.BROWN_DYE || i.getType() == Material.CYAN_DYE || i.getType() == Material.GRAY_DYE || i.getType() == Material.GREEN_DYE || i.getType() == Material.LIGHT_BLUE_DYE || i.getType() == Material.LIGHT_GRAY_DYE || i.getType() == Material.LIME_DYE || i.getType() == Material.MAGENTA_DYE || i.getType() == Material.ORANGE_DYE || i.getType() == Material.PINK_DYE || i.getType() == Material.PURPLE_DYE || i.getType() == Material.RED_DYE || i.getType() == Material.WHITE_DYE || i.getType() == Material.YELLOW_DYE) {
                    //対象はどんなブロックか?
                    //blockcolor変数の指定
                    String blockcolor = String.valueOf(b.getType());
                    //itemcolorの変数を作成
                    String itemcolor = String.valueOf(i.getType());
                    //_DYE_を削除
                    itemcolor = itemcolor.replaceFirst("_DYE", "");
                    //設置するブロックの指定
                    String setupblock;
                    //--------------------------------------------------------------------------------------------------
                    if (b.getType() == Material.BLACK_WOOL || b.getType() == Material.BLUE_WOOL || b.getType() == Material.BROWN_WOOL || b.getType() == Material.CYAN_WOOL || b.getType() == Material.GRAY_WOOL || b.getType() == Material.GREEN_WOOL || b.getType() == Material.LIGHT_BLUE_WOOL || b.getType() == Material.LIGHT_GRAY_WOOL || b.getType() == Material.LIME_WOOL || b.getType() == Material.MAGENTA_WOOL || b.getType() == Material.ORANGE_WOOL || b.getType() == Material.PINK_WOOL || b.getType() == Material.PURPLE_WOOL || b.getType() == Material.RED_WOOL || b.getType() == Material.WHITE_WOOL || b.getType() == Material.YELLOW_WOOL) {
                        // 持ってる染料で羊毛に色を付ける
                        //wool変数の指定
                        String wool = "_WOOL";
                        //_WOOL_を削除して色だけ残す
                        blockcolor = blockcolor.replaceFirst("_WOOL", "");
                        //
                        if (blockcolor.equals(itemcolor)) {
                        } else {
                            setupblock = itemcolor + wool;
                            //setupblockがなにか?
                            switch (setupblock) {
                                case "BLACK_WOOL":
                                    b.setType(Material.BLACK_WOOL);
                                    break;
                                case "BLUE_WOOL":
                                    b.setType(Material.BLUE_WOOL);
                                    break;
                                case "BROWN_WOOL":
                                    b.setType(Material.BROWN_WOOL);
                                    break;
                                case "CYAN_WOOL":
                                    b.setType(Material.CYAN_WOOL);
                                    break;
                                case "GRAY_WOOL":
                                    b.setType(Material.GRAY_WOOL);
                                    break;
                                case "GREEN_WOOL":
                                    b.setType(Material.GREEN_WOOL);
                                    break;
                                case "LIGHT_BLUE_WOOL":
                                    b.setType(Material.LIGHT_BLUE_WOOL);
                                    break;
                                case "LIGHT_GRAY_WOOL":
                                    b.setType(Material.LIGHT_GRAY_WOOL);
                                    break;
                                case "LIME_WOOL":
                                    b.setType(Material.LIME_WOOL);
                                    break;
                                case "MAGENTA_WOOL":
                                    b.setType(Material.MAGENTA_WOOL);
                                    break;
                                case "ORANGE_WOOL":
                                    b.setType(Material.ORANGE_WOOL);
                                    break;
                                case "PINK_WOOL":
                                    b.setType(Material.PINK_WOOL);
                                    break;
                                case "PURPLE_WOOL":
                                    b.setType(Material.PURPLE_WOOL);
                                    break;
                                case "RED_WOOL":
                                    b.setType(Material.RED_WOOL);
                                    break;
                                case "WHITE_WOOL":
                                    b.setType(Material.WHITE_WOOL);
                                    break;
                                case "YELLOW_WOOL":
                                    b.setType(Material.YELLOW_WOOL);
                                    break;
                            }
                        }
                    }
                    //--------------------------------------------------------------------------------------------------
                    if (b.getType() == Material.BLACK_CARPET || b.getType() == Material.BLUE_CARPET || b.getType() == Material.BROWN_CARPET || b.getType() == Material.CYAN_CARPET || b.getType() == Material.GRAY_CARPET || b.getType() == Material.GREEN_CARPET || b.getType() == Material.LIGHT_BLUE_CARPET || b.getType() == Material.LIGHT_GRAY_CARPET || b.getType() == Material.LIME_CARPET || b.getType() == Material.MAGENTA_CARPET || b.getType() == Material.ORANGE_CARPET || b.getType() == Material.PINK_CARPET || b.getType() == Material.PURPLE_CARPET || b.getType() == Material.RED_CARPET || b.getType() == Material.WHITE_CARPET || b.getType() == Material.YELLOW_CARPET){
                        //持っている染料でカーペットの色を変える
                        //carpet変数の指定
                        String carpet = "_CARPET";
                        //_CARPET_を削除して色だけ残す
                        blockcolor = blockcolor.replaceFirst("_CARPET", "");
                        //
                        if (blockcolor.equals(itemcolor)){
                        }else {
                            setupblock = itemcolor + carpet;
                            //setupblockがなにか?
                            switch (setupblock) {
                                case "BLACK_CARPET":
                                    b.setType(Material.BLACK_CARPET);
                                    break;
                                case "BLUE_CARPET":
                                    b.setType(Material.BLUE_CARPET);
                                    break;
                                case "BROWN_CARPET":
                                    b.setType(Material.BROWN_CARPET);
                                    break;
                                case "CYAN_CARPET":
                                    b.setType(Material.CYAN_CARPET);
                                    break;
                                case "GRAY_CARPET":
                                    b.setType(Material.GRAY_CARPET);
                                    break;
                                case "GREEN_CARPET":
                                    b.setType(Material.GREEN_CARPET);
                                    break;
                                case "LIGHT_BLUE_CARPET":
                                    b.setType(Material.LIGHT_BLUE_CARPET);
                                    break;
                                case "LIGHT_GRAY_CARPET":
                                    b.setType(Material.LIGHT_GRAY_CARPET);
                                    break;
                                case "LIME_CARPET":
                                    b.setType(Material.LIME_CARPET);
                                    break;
                                case "MAGENTA_CARPET":
                                    b.setType(Material.MAGENTA_CARPET);
                                    break;
                                case "ORANGE_CARPET":
                                    b.setType(Material.ORANGE_CARPET);
                                    break;
                                case "PINK_CARPET":
                                    b.setType(Material.PINK_CARPET);
                                    break;
                                case "PURPLE_CARPET":
                                    b.setType(Material.PURPLE_CARPET);
                                    break;
                                case "RED_CARPET":
                                    b.setType(Material.RED_CARPET);
                                    break;
                                case "WHITE_CARPET":
                                    b.setType(Material.WHITE_CARPET);
                                    break;
                                case "YELLOW_CARPET":
                                    b.setType(Material.YELLOW_CARPET);
                                    break;
                            }
                        }
                    }
                    //--------------------------------------------------------------------------------------------------
                    if (b.getType() == Material.BLACK_STAINED_GLASS || b.getType() == Material.BLUE_STAINED_GLASS || b.getType() == Material.BROWN_STAINED_GLASS || b.getType() == Material.CYAN_STAINED_GLASS || b.getType() == Material.GRAY_STAINED_GLASS || b.getType() == Material.GREEN_STAINED_GLASS || b.getType() == Material.LIGHT_BLUE_STAINED_GLASS || b.getType() == Material.LIGHT_GRAY_STAINED_GLASS || b.getType() == Material.LIME_STAINED_GLASS || b.getType() == Material.MAGENTA_STAINED_GLASS || b.getType() == Material.ORANGE_STAINED_GLASS || b.getType() == Material.PINK_STAINED_GLASS || b.getType() == Material.PURPLE_STAINED_GLASS || b.getType() == Material.RED_STAINED_GLASS || b.getType() == Material.WHITE_STAINED_GLASS || b.getType() == Material.YELLOW_STAINED_GLASS) {
                        //持っている染料でガラスの色を変える
                        //glass変数の指定
                        String glass = "_STAINED_GLASS";
                        //_STAINED_GLASS_を削除して色だけ残す
                        blockcolor = blockcolor.replaceFirst("_STAINED_GLASS", "");
                        //
                        if (blockcolor.equals(itemcolor)){
                        }else {
                            setupblock = itemcolor + glass;
                            //setupblockがなにか?
                            switch (setupblock) {
                                case "GLASS_STAINED_GLASS":
                                    broadcastMessage("バグ?");
                                    break;
                                case "BLACK_STAINED_GLASS":
                                    b.setType(Material.BLACK_STAINED_GLASS);
                                    break;
                                case "BLUE_STAINED_GLASS":
                                    b.setType(Material.BLUE_STAINED_GLASS);
                                    break;
                                case "BROWN_STAINED_GLASS":
                                    b.setType(Material.BROWN_STAINED_GLASS);
                                    break;
                                case "CYAN_STAINED_GLASS":
                                    b.setType(Material.CYAN_STAINED_GLASS);
                                    break;
                                case "GRAY_STAINED_GLASS":
                                    b.setType(Material.GRAY_STAINED_GLASS);
                                    break;
                                case "GREEN_STAINED_GLASS":
                                    b.setType(Material.GREEN_STAINED_GLASS);
                                    break;
                                case "LIGHT_BLUE_STAINED_GLASS":
                                    b.setType(Material.LIGHT_BLUE_STAINED_GLASS);
                                    break;
                                case "LIGHT_GRAY_STAINED_GLASS":
                                    b.setType(Material.LIGHT_GRAY_STAINED_GLASS);
                                    break;
                                case "LIME_STAINED_GLASS":
                                    b.setType(Material.LIME_STAINED_GLASS);
                                    break;
                                case "MAGENTA_STAINED_GLASS":
                                    b.setType(Material.MAGENTA_STAINED_GLASS);
                                    break;
                                case "ORANGE_STAINED_GLASS":
                                    b.setType(Material.ORANGE_STAINED_GLASS);
                                    break;
                                case "PINK_STAINED_GLASS":
                                    b.setType(Material.PINK_STAINED_GLASS);
                                    break;
                                case "PURPLE_STAINED_GLASS":
                                    b.setType(Material.PURPLE_STAINED_GLASS);
                                    break;
                                case "RED_STAINED_GLASS":
                                    b.setType(Material.RED_STAINED_GLASS);
                                    break;
                                case "WHITE_STAINED_GLASS":
                                    b.setType(Material.WHITE_STAINED_GLASS);
                                    break;
                                case "YELLOW_STAINED_GLASS":
                                    b.setType(Material.YELLOW_STAINED_GLASS);
                                    break;
                            }
                        }
                    }
                    //--------------------------------------------------------------------------------------------------
                    if (b.getType() == Material.BLACK_STAINED_GLASS_PANE || b.getType() == Material.BLUE_STAINED_GLASS_PANE || b.getType() == Material.BROWN_STAINED_GLASS_PANE || b.getType() == Material.CYAN_STAINED_GLASS_PANE || b.getType() == Material.GRAY_STAINED_GLASS_PANE || b.getType() == Material.GREEN_STAINED_GLASS_PANE || b.getType() == Material.LIGHT_BLUE_STAINED_GLASS_PANE || b.getType() == Material.LIGHT_GRAY_STAINED_GLASS_PANE || b.getType() == Material.LIME_STAINED_GLASS_PANE || b.getType() == Material.MAGENTA_STAINED_GLASS_PANE || b.getType() == Material.ORANGE_STAINED_GLASS_PANE || b.getType() == Material.PINK_STAINED_GLASS_PANE || b.getType() == Material.PURPLE_STAINED_GLASS_PANE || b.getType() == Material.RED_STAINED_GLASS_PANE || b.getType() == Material.WHITE_STAINED_GLASS_PANE || b.getType() == Material.YELLOW_STAINED_GLASS_PANE) {
                        //持っている染料で板ガラスの色を変える
                        //glassp変数の指定
                        String glassp = "_STAINED_GLASS_PANE";
                        //_STAINED_GLASS_を削除して色だけ残す
                        blockcolor = blockcolor.replaceFirst("_STAINED_GLASS_PANE", "");
                        //
                        if (blockcolor.equals(itemcolor)) {
                        }else {
                            setupblock = itemcolor + glassp;
                            //setupblockがなにか?
                            switch (setupblock) {
                                case "BLACK_STAINED_GLASS_PANE":
                                    b.setType(Material.BLACK_STAINED_GLASS_PANE);
                                    break;
                                case "BLUE_STAINED_GLASS_PANE":
                                    b.setType(Material.BLUE_STAINED_GLASS_PANE);
                                    break;
                                case "BROWN_STAINED_GLASS_PANE":
                                    b.setType(Material.BROWN_STAINED_GLASS_PANE);
                                    break;
                                case "CYAN_STAINED_GLASS_PANE":
                                    b.setType(Material.CYAN_STAINED_GLASS_PANE);
                                    break;
                                case "GRAY_STAINED_GLASS_PANE":
                                    b.setType(Material.GRAY_STAINED_GLASS_PANE);
                                    break;
                                case "GREEN_STAINED_GLASS_PANE":
                                    b.setType(Material.GREEN_STAINED_GLASS_PANE);
                                    break;
                                case "LIGHT_BLUE_STAINED_GLASS_PANE":
                                    b.setType(Material.LIGHT_BLUE_STAINED_GLASS_PANE);
                                    break;
                                case "LIGHT_GRAY_STAINED_GLASS_PANE":
                                    b.setType(Material.LIGHT_GRAY_STAINED_GLASS_PANE);
                                    break;
                                case "LIME_STAINED_GLASS_PANE":
                                    b.setType(Material.LIME_STAINED_GLASS_PANE);
                                    break;
                                case "MAGENTA_STAINED_GLASS_PANE":
                                    b.setType(Material.MAGENTA_STAINED_GLASS_PANE);
                                    break;
                                case "ORANGE_STAINED_GLASS_PANE":
                                    b.setType(Material.ORANGE_STAINED_GLASS_PANE);
                                    break;
                                case "PINK_STAINED_GLASS_PANE":
                                    b.setType(Material.PINK_STAINED_GLASS_PANE);
                                    break;
                                case "PURPLE_STAINED_GLASS_PANE":
                                    b.setType(Material.PURPLE_STAINED_GLASS_PANE);
                                    break;
                                case "RED_STAINED_GLASS_PANE":
                                    b.setType(Material.RED_STAINED_GLASS_PANE);
                                    break;
                                case "WHITE_STAINED_GLASS_PANE":
                                    b.setType(Material.WHITE_STAINED_GLASS_PANE);
                                    break;
                                case "YELLOW_STAINED_GLASS_PANE":
                                    b.setType(Material.YELLOW_STAINED_GLASS_PANE);
                                    break;
                            }
                        }
                    }
                    //--------------------------------------------------------------------------------------------------
                    if (b.getType() == Material.BLACK_TERRACOTTA || b.getType() == Material.BLUE_TERRACOTTA || b.getType() == Material.BROWN_TERRACOTTA || b.getType() == Material.CYAN_TERRACOTTA || b.getType() == Material.GRAY_TERRACOTTA || b.getType() == Material.GREEN_TERRACOTTA || b.getType() == Material.LIGHT_BLUE_TERRACOTTA || b.getType() == Material.LIGHT_GRAY_TERRACOTTA || b.getType() == Material.LIME_TERRACOTTA || b.getType() == Material.MAGENTA_TERRACOTTA || b.getType() == Material.ORANGE_TERRACOTTA || b.getType() == Material.PINK_TERRACOTTA || b.getType() == Material.PURPLE_TERRACOTTA || b.getType() == Material.RED_TERRACOTTA || b.getType() == Material.WHITE_TERRACOTTA || b.getType() == Material.YELLOW_TERRACOTTA) {
                        //持っている染料でテラコッタの色を変える
                        //terracotta変数の指定
                        String terracotta = "_TERRACOTTA";
                        //_STAINED_GLASS_を削除して色だけ残す
                        blockcolor = blockcolor.replaceFirst("_TERRACOTTA", "");
                        //
                        if (blockcolor.equals(itemcolor)) {
                        }else {
                            //setblockがなにか?
                            setupblock = itemcolor + terracotta;
                            switch (setupblock) {
                                case "BLACK_TERRACOTTA":
                                    b.setType(Material.BLACK_TERRACOTTA);
                                    break;
                                case "BLUE_TERRACOTTA":
                                    b.setType(Material.BLUE_TERRACOTTA);
                                    break;
                                case "BROWN_TERRACOTTA":
                                    b.setType(Material.BROWN_TERRACOTTA);
                                    break;
                                case "CYAN_TERRACOTTA":
                                    b.setType(Material.CYAN_TERRACOTTA);
                                    break;
                                case "GRAY_TERRACOTTA":
                                    b.setType(Material.GRAY_TERRACOTTA);
                                    break;
                                case "GREEN_TERRACOTTA":
                                    b.setType(Material.GREEN_TERRACOTTA);
                                    break;
                                case "LIGHT_BLUE_TERRACOTTA":
                                    b.setType(Material.LIGHT_BLUE_TERRACOTTA);
                                    break;
                                case "LIGHT_GRAY_TERRACOTTA":
                                    b.setType(Material.LIGHT_GRAY_TERRACOTTA);
                                    break;
                                case "LIME_TERRACOTTA":
                                    b.setType(Material.LIME_TERRACOTTA);
                                    break;
                                case "MAGENTA_TERRACOTTA":
                                    b.setType(Material.MAGENTA_TERRACOTTA);
                                    break;
                                case "ORANGE_TERRACOTTA":
                                    b.setType(Material.ORANGE_TERRACOTTA);
                                    break;
                                case "PINK_TERRACOTTA":
                                    b.setType(Material.PINK_TERRACOTTA);
                                    break;
                                case "PURPLE_TERRACOTTA":
                                    b.setType(Material.PURPLE_TERRACOTTA);
                                    break;
                                case "RED_TERRACOTTA":
                                    b.setType(Material.RED_TERRACOTTA);
                                    break;
                                case "WHITE_TERRACOTTA":
                                    b.setType(Material.WHITE_TERRACOTTA);
                                    break;
                                case "YELLOW_TERRACOTTA":
                                    b.setType(Material.YELLOW_TERRACOTTA);
                                    break;
                            }
                        }
                    }
                    //--------------------------------------------------------------------------------------------------
                    if (b.getType() == Material.BLACK_GLAZED_TERRACOTTA || b.getType() == Material.BLUE_GLAZED_TERRACOTTA || b.getType() == Material.BROWN_GLAZED_TERRACOTTA || b.getType() == Material.CYAN_GLAZED_TERRACOTTA || b.getType() == Material.GRAY_GLAZED_TERRACOTTA || b.getType() == Material.GREEN_GLAZED_TERRACOTTA || b.getType() == Material.LIGHT_BLUE_GLAZED_TERRACOTTA || b.getType() == Material.LIGHT_GRAY_GLAZED_TERRACOTTA || b.getType() == Material.LIME_GLAZED_TERRACOTTA || b.getType() == Material.MAGENTA_GLAZED_TERRACOTTA || b.getType() == Material.ORANGE_GLAZED_TERRACOTTA || b.getType() == Material.PINK_GLAZED_TERRACOTTA || b.getType() == Material.PURPLE_GLAZED_TERRACOTTA || b.getType() == Material.RED_GLAZED_TERRACOTTA || b.getType() == Material.WHITE_GLAZED_TERRACOTTA || b.getType() == Material.YELLOW_GLAZED_TERRACOTTA) {
                        //持っている染料で色付きテラコッタの色を変える
                        //glazedterracotta変数の指定
                        String glazedterracotta = "_GLAZED_TERRACOTTA";
                        //_GLAZED_TERRACOTTA_を削除して色だけ残す
                        blockcolor = blockcolor.replaceFirst("_GLAZED_TERRACOTTA", "");
                        //
                        if (blockcolor.equals(itemcolor)) {
                        }else {
                            //setblockがなにか?
                            setupblock = itemcolor + glazedterracotta;
                            switch (setupblock) {
                                case "BLACK_GLAZED_TERRACOTTA":
                                    b.setType(Material.BLACK_GLAZED_TERRACOTTA);
                                    break;
                                case "BLUE_GLAZED_TERRACOTTA":
                                    b.setType(Material.BLUE_GLAZED_TERRACOTTA);
                                    break;
                                case "BROWN_GLAZED_TERRACOTTA":
                                    b.setType(Material.BROWN_GLAZED_TERRACOTTA);
                                    break;
                                case "CYAN_GLAZED_TERRACOTTA":
                                    b.setType(Material.CYAN_GLAZED_TERRACOTTA);
                                    break;
                                case "GRAY_GLAZED_TERRACOTTA":
                                    b.setType(Material.GRAY_GLAZED_TERRACOTTA);
                                    break;
                                case "GREEN_GLAZED_TERRACOTTA":
                                    b.setType(Material.GREEN_GLAZED_TERRACOTTA);
                                    break;
                                case "LIGHT_BLUE_GLAZED_TERRACOTTA":
                                    b.setType(Material.LIGHT_BLUE_GLAZED_TERRACOTTA);
                                    break;
                                case "LIGHT_GRAY_GLAZED_TERRACOTTA":
                                    b.setType(Material.LIGHT_GRAY_GLAZED_TERRACOTTA);
                                    break;
                                case "LIME_GLAZED_TERRACOTTA":
                                    b.setType(Material.LIME_GLAZED_TERRACOTTA);
                                    break;
                                case "MAGENTA_GLAZED_TERRACOTTA":
                                    b.setType(Material.MAGENTA_GLAZED_TERRACOTTA);
                                    break;
                                case "ORANGE_GLAZED_TERRACOTTA":
                                    b.setType(Material.ORANGE_GLAZED_TERRACOTTA);
                                    break;
                                case "PINK_GLAZED_TERRACOTTA":
                                    b.setType(Material.PINK_GLAZED_TERRACOTTA);
                                    break;
                                case "PURPLE_GLAZED_TERRACOTTA":
                                    b.setType(Material.PURPLE_GLAZED_TERRACOTTA);
                                    break;
                                case "RED_GLAZED_TERRACOTTA":
                                    b.setType(Material.RED_GLAZED_TERRACOTTA);
                                    break;
                                case "WHITE_GLAZED_TERRACOTTA":
                                    b.setType(Material.WHITE_GLAZED_TERRACOTTA);
                                    break;
                                case "YELLOW_GLAZED_TERRACOTTA":
                                    b.setType(Material.YELLOW_GLAZED_TERRACOTTA);
                                    break;
                            }
                        }
                    }
                    //--------------------------------------------------------------------------------------------------
                    if (b.getType() == Material.BLACK_CONCRETE_POWDER || b.getType() == Material.BLUE_CONCRETE_POWDER || b.getType() == Material.BROWN_CONCRETE_POWDER || b.getType() == Material.CYAN_CONCRETE_POWDER || b.getType() == Material.GRAY_CONCRETE_POWDER || b.getType() == Material.GREEN_CONCRETE_POWDER || b.getType() == Material.LIGHT_BLUE_CONCRETE_POWDER || b.getType() == Material.LIGHT_GRAY_CONCRETE_POWDER || b.getType() == Material.LIME_CONCRETE_POWDER || b.getType() == Material.MAGENTA_CONCRETE_POWDER || b.getType() == Material.ORANGE_CONCRETE_POWDER || b.getType() == Material.PINK_CONCRETE_POWDER || b.getType() == Material.PURPLE_CONCRETE_POWDER || b.getType() == Material.RED_CONCRETE_POWDER || b.getType() == Material.WHITE_CONCRETE_POWDER || b.getType() == Material.YELLOW_CONCRETE_POWDER) {
                        //持っている染料で色付きコンクリートパウダーの色を変える
                        //concretepowder変数の指定
                        String concretepowder = "_CONCRETE_POWDER";
                        //_CONCRETE_POWDER_を削除して色だけ残す
                        blockcolor = blockcolor.replaceFirst("_CONCRETE_POWDER", "");
                        //
                        if (blockcolor.equals(itemcolor)) {
                        }else {
                            //setblockがなにか?
                            setupblock = itemcolor + concretepowder;
                            switch (setupblock) {
                                case "BLACK_CONCRETE_POWDER":
                                    b.setType(Material.BLACK_CONCRETE_POWDER);
                                    break;
                                case "BLUE_CONCRETE_POWDER":
                                    b.setType(Material.BLUE_CONCRETE_POWDER);
                                    break;
                                case "BROWN_CONCRETE_POWDER":
                                    b.setType(Material.BROWN_CONCRETE_POWDER);
                                    break;
                                case "CYAN_CONCRETE_POWDER":
                                    b.setType(Material.CYAN_CONCRETE_POWDER);
                                    break;
                                case "GRAY_CONCRETE_POWDER":
                                    b.setType(Material.GRAY_CONCRETE_POWDER);
                                    break;
                                case "GREEN_CONCRETE_POWDER":
                                    b.setType(Material.GREEN_CONCRETE_POWDER);
                                    break;
                                case "LIGHT_BLUE_CONCRETE_POWDER":
                                    b.setType(Material.LIGHT_BLUE_CONCRETE_POWDER);
                                    break;
                                case "LIGHT_GRAY_CONCRETE_POWDER":
                                    b.setType(Material.LIGHT_GRAY_CONCRETE_POWDER);
                                    break;
                                case "LIME_CONCRETE_POWDER":
                                    b.setType(Material.LIME_CONCRETE_POWDER);
                                    break;
                                case "MAGENTA_CONCRETE_POWDER":
                                    b.setType(Material.MAGENTA_CONCRETE_POWDER);
                                    break;
                                case "ORANGE_CONCRETE_POWDER":
                                    b.setType(Material.ORANGE_CONCRETE_POWDER);
                                    break;
                                case "PINK_CONCRETE_POWDER":
                                    b.setType(Material.PINK_CONCRETE_POWDER);
                                    break;
                                case "PURPLE_CONCRETE_POWDER":
                                    b.setType(Material.PURPLE_CONCRETE_POWDER);
                                    break;
                                case "RED_CONCRETE_POWDER":
                                    b.setType(Material.RED_CONCRETE_POWDER);
                                    break;
                                case "WHITE_CONCRETE_POWDER":
                                    b.setType(Material.WHITE_CONCRETE_POWDER);
                                    break;
                                case "YELLOW_CONCRETE_POWDER":
                                    b.setType(Material.YELLOW_CONCRETE_POWDER);
                                    break;
                            }
                        }
                    }
                    //--------------------------------------------------------------------------------------------------
                    //--------------------------------------------------------------------------------------------------
                }
            }
        }
    }
}
