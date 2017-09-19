<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/header.jsp"%>
<c:url value="/goods/list" var="readUrl" />
<c:url value="/goods/create" var="createUrl" />
<c:url value="/goods/delete" var="deleteUrl" />
<c:url value="/goods/update" var="updateUrl" />
<c:url value="/vendor/combo" var="vendorValue" />
<title>상품 목록</title>
</head>
<script>
//    $(document).ready(function() {
//       if (!"${vendos}") { 
//          location.href = "${vendorValue}";
//       } 
//    }); 
</script> 
<body>
   <br> 
   <p />
   <br>
   <p />
   <br>
   <p />
   <kendo:grid title="그리드" name="grid" pageable="true" sortable="true"
      scrollable="false" height="450" align="center">
      <kendo:grid-editable mode="incell" />
      <kendo:grid-toolbar>
         <kendo:grid-toolbarItem name="cancel" text="취소" />
         <kendo:grid-toolbarItem name="create" text="생성" />
         <kendo:grid-toolbarItem name="save" text="저장" />
         <kendo:grid-toolbarItem name="destroy" text="파괴" />
         <kendo:grid-toolbarItem name="update" text="수정" />
      </kendo:grid-toolbar>
      <kendo:grid-columns>
         <kendo:grid-column title="No." field="giNum" />
         <kendo:grid-column title="상품명" field="giName" />
         <kendo:grid-column title="상품설명" field="giDesc" />
         <kendo:grid-column title="생산자번호" field="viNum">
            <kendo:grid-column-values value="${list}"/>
         </kendo:grid-column>
         <kendo:grid-column title="생산일자" field="giCredat"/>
         <kendo:grid-column title="생산시간" field="giCretim" />
         <kendo:grid-column command="destroy" title="삭제" />
      </kendo:grid-columns>
      
      <kendo:dataSource pageSize="10" batch="true">
         <kendo:dataSource-transport>
            <!-- datatype -->
            <kendo:dataSource-transport-read url="${readUrl}" dataType="json"
               type="POST" contentType="application/json" />
            <kendo:dataSource-transport-create url="${createUrl}"
               dataType="json" type="POST" contentType="application/json" />
            <kendo:dataSource-transport-update url="${updateUrl}"
               dataType="json" type="POST" contentType="application/json" />
            <kendo:dataSource-transport-destroy url="${deleteUrl}"
               dataType="json" type="POST" contentType="application/json" />
            <kendo:dataSource-transport-parameterMap>
               <script>
                  function parameterMap(options, type) {
                     if (type === "read") {
                        return JSON.stringify(options);
                     } else {
                        return JSON.stringify(options.models);
                     }
                  }
               </script>
            </kendo:dataSource-transport-parameterMap>
         </kendo:dataSource-transport>
         <kendo:dataSource-schema><!--  입력하는 친구 정의  -->
            <kendo:dataSource-schema-model id="giNum"> <!-- table 기본키 primary-->
               <kendo:dataSource-schema-model-fields>
                  <kendo:dataSource-schema-model-field name="giNum" type ="number" editable="false"/>
                  <kendo:dataSource-schema-model-field name="giName" type="string">
                     <kendo:dataSource-schema-model-field-validation required="true" />
                  </kendo:dataSource-schema-model-field>
                  <kendo:dataSource-schema-model-field name="giDesc" type="string">
                     <kendo:dataSource-schema-model-field-validation required="true" />
                  </kendo:dataSource-schema-model-field>
                  <kendo:dataSource-schema-model-field name="viNum" defaultValue="1">
                     <kendo:dataSource-schema-model-field-validation required="true" min="1" />
                  </kendo:dataSource-schema-model-field>
                  <kendo:dataSource-schema-model-field name="giCredat" editable="false">
                  </kendo:dataSource-schema-model-field>
                  <kendo:dataSource-schema-model-field name="giCretim" editable="false">
                  </kendo:dataSource-schema-model-field>
               </kendo:dataSource-schema-model-fields> 
            </kendo:dataSource-schema-model>
         </kendo:dataSource-schema>
      </kendo:dataSource>
   </kendo:grid>
</body>
</html> 