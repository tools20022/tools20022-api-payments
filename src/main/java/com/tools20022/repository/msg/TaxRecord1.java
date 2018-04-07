/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.entity.TaxRecord;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TaxAmount1;
import com.tools20022.repository.msg.TaxPeriod1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to define the tax record.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmType
 * TaxRecord1.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmCategory
 * TaxRecord1.mmCategory}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmCategoryDetails
 * TaxRecord1.mmCategoryDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmDebtorStatus
 * TaxRecord1.mmDebtorStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxRecord1#mmCertificateIdentification
 * TaxRecord1.mmCertificateIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmFormsCode
 * TaxRecord1.mmFormsCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmPeriod
 * TaxRecord1.mmPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmTaxAmount
 * TaxRecord1.mmTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxRecord1#mmAdditionalInformation
 * TaxRecord1.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TaxRecord TaxRecord}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxRecord1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of elements used to define the tax record."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord2 TaxRecord2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TaxRecord1", propOrder = {"type", "category", "categoryDetails", "debtorStatus", "certificateIdentification", "formsCode", "period", "taxAmount", "additionalInformation"})
public class TaxRecord1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp")
	protected Max35Text type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmTaxRecordType
	 * TaxRecord.mmTaxRecordType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxRecord1
	 * TaxRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "High level code to identify the type of tax details."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord2#mmType
	 * TaxRecord2.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxRecord1, Optional<Max35Text>> mmType = new MMMessageAttribute<TaxRecord1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TaxRecord.mmTaxRecordType;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "High level code to identify the type of tax details.";
			nextVersions_lazy = () -> Arrays.asList(TaxRecord2.mmType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TaxRecord1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(TaxRecord1 obj, Optional<Max35Text> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Ctgy")
	protected Max35Text category;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmCategory
	 * TaxRecord.mmCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxRecord1
	 * TaxRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Category"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the tax code as published by the tax authority."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord2#mmCategory
	 * TaxRecord2.mmCategory}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxRecord1, Optional<Max35Text>> mmCategory = new MMMessageAttribute<TaxRecord1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TaxRecord.mmCategory;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "Ctgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Category";
			definition = "Specifies the tax code as published by the tax authority.";
			nextVersions_lazy = () -> Arrays.asList(TaxRecord2.mmCategory);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TaxRecord1 obj) {
			return obj.getCategory();
		}

		@Override
		public void setValue(TaxRecord1 obj, Optional<Max35Text> value) {
			obj.setCategory(value.orElse(null));
		}
	};
	@XmlElement(name = "CtgyDtls")
	protected Max35Text categoryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxRecord1
	 * TaxRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtgyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides further details of the category tax code."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxRecord2#mmCategoryDetails
	 * TaxRecord2.mmCategoryDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxRecord1, Optional<Max35Text>> mmCategoryDetails = new MMMessageAttribute<TaxRecord1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "CtgyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryDetails";
			definition = "Provides further details of the category tax code.";
			nextVersions_lazy = () -> Arrays.asList(TaxRecord2.mmCategoryDetails);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TaxRecord1 obj) {
			return obj.getCategoryDetails();
		}

		@Override
		public void setValue(TaxRecord1 obj, Optional<Max35Text> value) {
			obj.setCategoryDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrSts")
	protected Max35Text debtorStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmStatus
	 * TaxRecord.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxRecord1
	 * TaxRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code provided by local authority to identify the status of the party that has drawn up the settlement document."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord2#mmDebtorStatus
	 * TaxRecord2.mmDebtorStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxRecord1, Optional<Max35Text>> mmDebtorStatus = new MMMessageAttribute<TaxRecord1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TaxRecord.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "DbtrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorStatus";
			definition = "Code provided by local authority to identify the status of the party that has drawn up the settlement document.";
			nextVersions_lazy = () -> Arrays.asList(TaxRecord2.mmDebtorStatus);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TaxRecord1 obj) {
			return obj.getDebtorStatus();
		}

		@Override
		public void setValue(TaxRecord1 obj, Optional<Max35Text> value) {
			obj.setDebtorStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "CertId")
	protected Max35Text certificateIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmCertificateIdentification
	 * Tax.mmCertificateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxRecord1
	 * TaxRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification number of the tax report as assigned by the taxing authority."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxRecord2#mmCertificateIdentification
	 * TaxRecord2.mmCertificateIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxRecord1, Optional<Max35Text>> mmCertificateIdentification = new MMMessageAttribute<TaxRecord1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmCertificateIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "CertId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateIdentification";
			definition = "Identification number of the tax report as assigned by the taxing authority.";
			nextVersions_lazy = () -> Arrays.asList(TaxRecord2.mmCertificateIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TaxRecord1 obj) {
			return obj.getCertificateIdentification();
		}

		@Override
		public void setValue(TaxRecord1 obj, Optional<Max35Text> value) {
			obj.setCertificateIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "FrmsCd")
	protected Max35Text formsCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmFormsCode
	 * TaxRecord.mmFormsCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxRecord1
	 * TaxRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrmsCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormsCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies, in a coded form, on which template the tax report is to be provided."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord2#mmFormsCode
	 * TaxRecord2.mmFormsCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxRecord1, Optional<Max35Text>> mmFormsCode = new MMMessageAttribute<TaxRecord1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TaxRecord.mmFormsCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "FrmsCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormsCode";
			definition = "Identifies, in a coded form, on which template the tax report is to be provided.";
			nextVersions_lazy = () -> Arrays.asList(TaxRecord2.mmFormsCode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TaxRecord1 obj) {
			return obj.getFormsCode();
		}

		@Override
		public void setValue(TaxRecord1 obj, Optional<Max35Text> value) {
			obj.setFormsCode(value.orElse(null));
		}
	};
	@XmlElement(name = "Prd")
	protected TaxPeriod1 period;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxPeriod1 TaxPeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmPeriod
	 * TaxRecord.mmPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxRecord1
	 * TaxRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Period"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide details on the period of time related to the tax payment."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord2#mmPeriod
	 * TaxRecord2.mmPeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxRecord1, Optional<TaxPeriod1>> mmPeriod = new MMMessageAssociationEnd<TaxRecord1, Optional<TaxPeriod1>>() {
		{
			businessElementTrace_lazy = () -> TaxRecord.mmPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "Prd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Period";
			definition = "Set of elements used to provide details on the period of time related to the tax payment.";
			nextVersions_lazy = () -> Arrays.asList(TaxRecord2.mmPeriod);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxPeriod1.mmObject();
		}

		@Override
		public Optional<TaxPeriod1> getValue(TaxRecord1 obj) {
			return obj.getPeriod();
		}

		@Override
		public void setValue(TaxRecord1 obj, Optional<TaxPeriod1> value) {
			obj.setPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxAmt")
	protected TaxAmount1 taxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxAmount1 TaxAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmTax
	 * TaxRecord.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxRecord1
	 * TaxRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information on the amount of the tax record."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord2#mmTaxAmount
	 * TaxRecord2.mmTaxAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxRecord1, Optional<TaxAmount1>> mmTaxAmount = new MMMessageAssociationEnd<TaxRecord1, Optional<TaxAmount1>>() {
		{
			businessElementTrace_lazy = () -> TaxRecord.mmTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "TaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAmount";
			definition = "Set of elements used to provide information on the amount of the tax record.";
			nextVersions_lazy = () -> Arrays.asList(TaxRecord2.mmTaxAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxAmount1.mmObject();
		}

		@Override
		public Optional<TaxAmount1> getValue(TaxRecord1 obj) {
			return obj.getTaxAmount();
		}

		@Override
		public void setValue(TaxRecord1 obj, Optional<TaxAmount1> value) {
			obj.setTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max140Text additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxRecord1
	 * TaxRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details of the tax record."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxRecord2#mmAdditionalInformation
	 * TaxRecord2.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxRecord1, Optional<Max140Text>> mmAdditionalInformation = new MMMessageAttribute<TaxRecord1, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Further details of the tax record.";
			nextVersions_lazy = () -> Arrays.asList(TaxRecord2.mmAdditionalInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(TaxRecord1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(TaxRecord1 obj, Optional<Max140Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxRecord1.mmType, com.tools20022.repository.msg.TaxRecord1.mmCategory, com.tools20022.repository.msg.TaxRecord1.mmCategoryDetails,
						com.tools20022.repository.msg.TaxRecord1.mmDebtorStatus, com.tools20022.repository.msg.TaxRecord1.mmCertificateIdentification, com.tools20022.repository.msg.TaxRecord1.mmFormsCode,
						com.tools20022.repository.msg.TaxRecord1.mmPeriod, com.tools20022.repository.msg.TaxRecord1.mmTaxAmount, com.tools20022.repository.msg.TaxRecord1.mmAdditionalInformation);
				trace_lazy = () -> TaxRecord.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxRecord1";
				definition = "Set of elements used to define the tax record.";
				nextVersions_lazy = () -> Arrays.asList(TaxRecord2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public TaxRecord1 setType(Max35Text type) {
		this.type = type;
		return this;
	}

	public Optional<Max35Text> getCategory() {
		return category == null ? Optional.empty() : Optional.of(category);
	}

	public TaxRecord1 setCategory(Max35Text category) {
		this.category = category;
		return this;
	}

	public Optional<Max35Text> getCategoryDetails() {
		return categoryDetails == null ? Optional.empty() : Optional.of(categoryDetails);
	}

	public TaxRecord1 setCategoryDetails(Max35Text categoryDetails) {
		this.categoryDetails = categoryDetails;
		return this;
	}

	public Optional<Max35Text> getDebtorStatus() {
		return debtorStatus == null ? Optional.empty() : Optional.of(debtorStatus);
	}

	public TaxRecord1 setDebtorStatus(Max35Text debtorStatus) {
		this.debtorStatus = debtorStatus;
		return this;
	}

	public Optional<Max35Text> getCertificateIdentification() {
		return certificateIdentification == null ? Optional.empty() : Optional.of(certificateIdentification);
	}

	public TaxRecord1 setCertificateIdentification(Max35Text certificateIdentification) {
		this.certificateIdentification = certificateIdentification;
		return this;
	}

	public Optional<Max35Text> getFormsCode() {
		return formsCode == null ? Optional.empty() : Optional.of(formsCode);
	}

	public TaxRecord1 setFormsCode(Max35Text formsCode) {
		this.formsCode = formsCode;
		return this;
	}

	public Optional<TaxPeriod1> getPeriod() {
		return period == null ? Optional.empty() : Optional.of(period);
	}

	public TaxRecord1 setPeriod(TaxPeriod1 period) {
		this.period = period;
		return this;
	}

	public Optional<TaxAmount1> getTaxAmount() {
		return taxAmount == null ? Optional.empty() : Optional.of(taxAmount);
	}

	public TaxRecord1 setTaxAmount(TaxAmount1 taxAmount) {
		this.taxAmount = taxAmount;
		return this;
	}

	public Optional<Max140Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public TaxRecord1 setAdditionalInformation(Max140Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}