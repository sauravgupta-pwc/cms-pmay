import org.craftercms.engine.model.SiteItem;
import org.dom4j.Document;

SiteItem item = siteItemService.getSiteItem("/site/components/contents${params.site}");
if(item==null)
    return ["err_code":"404","err_message":"Mentioned page not found"];
Document document = item.getDom();


return document;
