package vos.intellij.ide.view.grouper

import com.intellij.icons.AllIcons
import com.intellij.ide.util.treeView.AbstractTreeNode
import com.intellij.ide.util.treeView.smartTree.*
import vos.intellij.language.file.VosBundle

object PropertiesGrouper : Grouper {
    override fun getName(): String = "action.view.grouper.properties"
    override fun getPresentation(): ActionPresentation = ActionPresentationData(
        VosBundle.message(name),
        null,
        AllIcons.Nodes.AbstractClass
    )

    override fun group(parent: AbstractTreeNode<*>, children: MutableCollection<TreeElement>): MutableCollection<Group> {
        return arrayListOf()
    }
}