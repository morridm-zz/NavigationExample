package NavigationExample.ui;

import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;

/**
 * NavigationView111 has no forward navigation and displays some text.<br/>
 * Navigation level 3.
 *
 * @author Sebastian Stumpf
 */
public class NavigationView111 extends NavigationView {

    public NavigationView111() {
        super();
        setContent(myContent());
        setCaption("Third Level Navigation 111");
    }

    /**
     * Generate the content.
     *
     * @return the content.
     */
    private Component myContent() {
        VerticalComponentGroup content = new VerticalComponentGroup();

        Label textContent = new Label();
        textContent.setContentMode(Label.CONTENT_XHTML);
        textContent.setValue("<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Summae mihi videtur inscitiae. Non potes, nisi retexueris illa. <b>Si quidem, inquit, tollerem, sed relinquo.</b> Nam Pyrrho, Aristo, Erillus iam diu abiecti. <a href=\"http://loripsum.net/\" target=\"_blank\">Duo Reges: constructio interrete.</a> Honesta oratio, Socratica, Platonis etiam. Primum divisit ineleganter; <mark>Sed tamen intellego quid velit.</mark> </p>" +
                "<dl>" +
                "<dt><dfn>Idem adhuc;</dfn></dt>" +
                "<dd>Non enim iam stirpis bonum quaeret, sed animalis.</dd>" +
                "<dt><dfn>Quid iudicant sensus?</dfn></dt>" +
                "<dd>Praeclare Laelius, et recte sofñw, illudque vere: O Publi, o gurges, Galloni! es homo miser, inquit.</dd>" +
                "<dt><dfn>Confecta res esset.</dfn></dt>" +
                "<dd>Deque his rebus satis multa in nostris de re publica libris sunt dicta a Laelio.</dd>" +
                "<dt><dfn>ALIO MODO.</dfn></dt>" +
                "<dd>Quae hic rei publicae vulnera inponebat, eadem ille sanabat.</dd>" +
                "<dt><dfn>Quid Zeno?</dfn></dt>" +
                "<dd>Dici enim nihil potest verius.</dd>" +
                "</dl>" +
                "<p>Zenonis est, inquam, hoc Stoici. <a href=\"http://loripsum.net/\" target=\"_blank\">Avaritiamne minuis?</a> Uterque enim summo bono fruitur, id est voluptate. Istam voluptatem perpetuam quis potest praestare sapienti? <a href=\"http://loripsum.net/\" target=\"_blank\">Quibusnam praeteritis?</a> An eiusdem modi? Earum etiam rerum, quas terra gignit, educatio quaedam et perfectio est non dissimilis animantium. </p>" +
                "<ol>" +
                "<li>Quid enim de amicitia statueris utilitatis causa expetenda vides.</li>" +
                "<li>Quasi vero, inquit, perpetua oratio rhetorum solum, non etiam philosophorum sit.</li>" +
                "<li>In eo enim positum est id, quod dicimus esse expetendum.</li>" +
                "</ol>" +
                "<p><b>Comprehensum, quod cognitum non habet?</b> Memini me adesse P. Quamquam ab iis philosophiam et omnes ingenuas disciplinas habemus; <mark>Itaque contra est, ac dicitis;</mark> Sit enim idem caecus, debilis. Conferam tecum, quam cuique verso rem subicias; Sequitur disserendi ratio cognitioque naturae; Est enim tanti philosophi tamque nobilis audacter sua decreta defendere. Nec vero sum nescius esse utilitatem in historia, non modo voluptatem. </p>" +
                "<p>Quem Tiberina descensio festo illo die tanto gaudio affecit, quanto L. <a href=\"http://loripsum.net/\" target=\"_blank\">Recte, inquit, intellegis.</a> Quonam modo? Summae mihi videtur inscitiae. <mark>Qualem igitur hominem natura inchoavit?</mark> Immo vero, inquit, ad beatissime vivendum parum est, ad beate vero satis. <a href=\"http://loripsum.net/\" target=\"_blank\">Sed haec omittamus;</a> Quamquam ab iis philosophiam et omnes ingenuas disciplinas habemus; </p>" +
                "<blockquote cite=\"http://loripsum.net\">" +
                "Cum autem paulum firmitatis accessit, et animo utuntur et sensibus conitunturque, ut sese erigant, et manibus utuntur et eos agnoscunt, a quibus educantur." +
                "</blockquote>" +
                "<p>Atque ab his initiis profecti omnium virtutum et originem et progressionem persecuti sunt. Apparet statim, quae sint officia, quae actiones. Quae est igitur causa istarum angustiarum? <b>Dici enim nihil potest verius.</b> <i>Ea possunt paria non esse.</i> Nihil enim hoc differt. </p>" +
                "<ul>" +
                "<li>Fieri, inquam, Triari, nullo pacto potest, ut non dicas, quid non probes eius, a quo dissentias.</li>" +
                "<li>Summum ením bonum exposuit vacuitatem doloris;</li>" +
                "<li>Oratio me istius philosophi non offendit;</li>" +
                "<li>Aliter homines, aliter philosophos loqui putas oportere?</li>" +
                "<li>Ut scias me intellegere, primum idem esse dico voluptatem, quod ille don.</li>" +
                "<li>Aliter homines, aliter philosophos loqui putas oportere?</li>" +
                "<li>Sed quid sentiat, non videtis.</li>" +
                "</ul>");

        content.addComponent(textContent);
        return content;
    }
}
