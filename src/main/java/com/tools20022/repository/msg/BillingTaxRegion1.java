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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max40Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Tax region that levies a tax on the services in a statement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmRegionNumber
 * BillingTaxRegion1.mmRegionNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmRegionName
 * BillingTaxRegion1.mmRegionName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmCustomerTaxIdentification
 * BillingTaxRegion1.mmCustomerTaxIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmPointDate
 * BillingTaxRegion1.mmPointDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmSendingFinancialInstitution
 * BillingTaxRegion1.mmSendingFinancialInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmInvoiceNumber
 * BillingTaxRegion1.mmInvoiceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmMethodC
 * BillingTaxRegion1.mmMethodC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmSettlementAmount
 * BillingTaxRegion1.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmTaxDueToRegion
 * BillingTaxRegion1.mmTaxDueToRegion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BillingTaxRegion1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tax region that levies a tax on the services in a statement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BillingTaxRegion1", propOrder = {"regionNumber", "regionName", "customerTaxIdentification", "pointDate", "sendingFinancialInstitution", "invoiceNumber", "methodC", "settlementAmount", "taxDueToRegion"})
public class BillingTaxRegion1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max40Text regionNumber;
	/**
	 * Specifies a particular unique zone of taxes assigned by taxing
	 * authorities. A tax region number is unique. Every account is considered
	 * to reside within a tax region, although some tax regions may not charge
	 * taxes on services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max40Text
	 * Max40Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1
	 * BillingTaxRegion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a particular unique zone of taxes assigned by taxing authorities.  A tax region number is unique.  Every account is considered to reside within a tax region, although some tax regions may not charge taxes on services."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegionNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingTaxRegion1.mmObject();
			isDerived = false;
			xmlTag = "RgnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegionNumber";
			definition = "Specifies a particular unique zone of taxes assigned by taxing authorities.  A tax region number is unique.  Every account is considered to reside within a tax region, although some tax regions may not charge taxes on services.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max40Text.mmObject();
		}
	};
	protected Max40Text regionName;
	/**
	 * Name associated with a specific tax region number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max40Text
	 * Max40Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAdministrationZone
	 * Tax.mmAdministrationZone}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1
	 * BillingTaxRegion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgnNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegionName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name associated with a specific tax region number."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegionName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAdministrationZone;
			componentContext_lazy = () -> BillingTaxRegion1.mmObject();
			isDerived = false;
			xmlTag = "RgnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegionName";
			definition = "Name associated with a specific tax region number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max40Text.mmObject();
		}
	};
	protected Max40Text customerTaxIdentification;
	/**
	 * Specifies the financial institution’s customer tax identification number.
	 * 
	 * Usage: This is the number passed from the financial institution to the
	 * taxing authority to indicate the specific customer tied to the taxes
	 * calculated for this tax region and group of delivered services. It is
	 * typically the tax identification tied to a customer’s account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max40Text
	 * Max40Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTaxIdentificationNumber
	 * PartyIdentificationInformation.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1
	 * BillingTaxRegion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrTaxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerTaxIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the financial institution’s customer tax identification number.  \n\nUsage:\nThis is the number passed from the financial institution to the taxing authority to indicate the specific customer tied to the taxes calculated for this tax region and group of delivered services.  It is typically the tax identification tied to a customer’s account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCustomerTaxIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmTaxIdentificationNumber;
			componentContext_lazy = () -> BillingTaxRegion1.mmObject();
			isDerived = false;
			xmlTag = "CstmrTaxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerTaxIdentification";
			definition = "Specifies the financial institution’s customer tax identification number.  \n\nUsage:\nThis is the number passed from the financial institution to the taxing authority to indicate the specific customer tied to the taxes calculated for this tax region and group of delivered services.  It is typically the tax identification tied to a customer’s account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max40Text.mmObject();
		}
	};
	protected ISODate pointDate;
	/**
	 * Date on which the tax calculation was performed.
	 * 
	 * Usage: This date can be used to verify the tax rate value on the
	 * calculation date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxDate Tax.mmTaxDate}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1
	 * BillingTaxRegion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PointDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the tax calculation was performed. \n\nUsage:\nThis date can be used to verify the tax rate value on the calculation date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPointDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxDate;
			componentContext_lazy = () -> BillingTaxRegion1.mmObject();
			isDerived = false;
			xmlTag = "PtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PointDate";
			definition = "Date on which the tax calculation was performed. \n\nUsage:\nThis date can be used to verify the tax rate value on the calculation date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected BillingTaxIdentification1 sendingFinancialInstitution;
	/**
	 * Tax information that relates to the sending financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BillingTaxIdentification1
	 * BillingTaxIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmPartyRole
	 * Tax.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1
	 * BillingTaxRegion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndgFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendingFinancialInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax information that relates to the sending financial institution."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSendingFinancialInstitution = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmPartyRole;
			componentContext_lazy = () -> BillingTaxRegion1.mmObject();
			isDerived = false;
			xmlTag = "SndgFI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendingFinancialInstitution";
			definition = "Tax information that relates to the sending financial institution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BillingTaxIdentification1.mmObject();
		}
	};
	protected Max40Text invoiceNumber;
	/**
	 * Unique number to be used by the customer to cross-reference between the
	 * tax region information and a tax invoice or notice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max40Text
	 * Max40Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1
	 * BillingTaxRegion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique number to be used by the customer to cross-reference between the tax region information and a tax invoice or notice."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvoiceNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> BillingTaxRegion1.mmObject();
			isDerived = false;
			xmlTag = "InvcNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceNumber";
			definition = "Unique number to be used by the customer to cross-reference between the tax region information and a tax invoice or notice.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max40Text.mmObject();
		}
	};
	protected BillingMethod4 methodC;
	/**
	 * Tax values are based on tax calculation method C.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingMethod4
	 * BillingMethod4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1
	 * BillingTaxRegion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtdC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MethodC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax values are based on tax calculation method C."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMethodC = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Tax.mmObject();
			componentContext_lazy = () -> BillingTaxRegion1.mmObject();
			isDerived = false;
			xmlTag = "MtdC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MethodC";
			definition = "Tax values are based on tax calculation method C.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BillingMethod4.mmObject();
		}
	};
	protected AmountAndDirection34 settlementAmount;
	/**
	 * Total tax amount expressed in the account’s settlement (or charging)
	 * currency.
	 * 
	 * Usage: This total sums the individual service level taxes as calculated
	 * for each service by methods A, B and D. The sum of these amounts across
	 * all tax regions for the statement is displayed as the tax total sum in
	 * the compensation section.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1
	 * BillingTaxRegion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total tax amount expressed in the account’s settlement (or charging) currency.  \n\nUsage: This total sums the individual service level taxes as calculated for each service by methods A, B and D. The sum of these amounts across all tax regions for the statement is displayed as the tax total sum in the compensation section."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> BillingTaxRegion1.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total tax amount expressed in the account’s settlement (or charging) currency.  \n\nUsage: This total sums the individual service level taxes as calculated for each service by methods A, B and D. The sum of these amounts across all tax regions for the statement is displayed as the tax total sum in the compensation section.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection34.mmObject();
		}
	};
	protected AmountAndDirection34 taxDueToRegion;
	/**
	 * Total amount of all taxes for a specific customer within the tax region
	 * expressed in the tax region’s host currency.
	 * 
	 * Usage: It is the same value as total tax amount and is included for the
	 * specific use of tax calculation methods A , B and D.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1
	 * BillingTaxRegion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDueToRgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDueToRegion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of all taxes for a specific customer within the tax region expressed in the tax region’s host currency. \n\nUsage: It is the same value as total tax amount and is included for the specific use of tax calculation methods A , B and D."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxDueToRegion = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> BillingTaxRegion1.mmObject();
			isDerived = false;
			xmlTag = "TaxDueToRgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDueToRegion";
			definition = "Total amount of all taxes for a specific customer within the tax region expressed in the tax region’s host currency. \n\nUsage: It is the same value as total tax amount and is included for the specific use of tax calculation methods A , B and D.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection34.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BillingTaxRegion1.mmRegionNumber, BillingTaxRegion1.mmRegionName, BillingTaxRegion1.mmCustomerTaxIdentification, BillingTaxRegion1.mmPointDate,
						BillingTaxRegion1.mmSendingFinancialInstitution, BillingTaxRegion1.mmInvoiceNumber, BillingTaxRegion1.mmMethodC, BillingTaxRegion1.mmSettlementAmount, BillingTaxRegion1.mmTaxDueToRegion);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BillingTaxRegion1";
				definition = "Tax region that levies a tax on the services in a statement.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RgnNb", required = true)
	public Max40Text getRegionNumber() {
		return regionNumber;
	}

	public void setRegionNumber(Max40Text regionNumber) {
		this.regionNumber = regionNumber;
	}

	@XmlElement(name = "RgnNm", required = true)
	public Max40Text getRegionName() {
		return regionName;
	}

	public void setRegionName(Max40Text regionName) {
		this.regionName = regionName;
	}

	@XmlElement(name = "CstmrTaxId", required = true)
	public Max40Text getCustomerTaxIdentification() {
		return customerTaxIdentification;
	}

	public void setCustomerTaxIdentification(Max40Text customerTaxIdentification) {
		this.customerTaxIdentification = customerTaxIdentification;
	}

	@XmlElement(name = "PtDt")
	public ISODate getPointDate() {
		return pointDate;
	}

	public void setPointDate(ISODate pointDate) {
		this.pointDate = pointDate;
	}

	@XmlElement(name = "SndgFI")
	public BillingTaxIdentification1 getSendingFinancialInstitution() {
		return sendingFinancialInstitution;
	}

	public void setSendingFinancialInstitution(com.tools20022.repository.msg.BillingTaxIdentification1 sendingFinancialInstitution) {
		this.sendingFinancialInstitution = sendingFinancialInstitution;
	}

	@XmlElement(name = "InvcNb")
	public Max40Text getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(Max40Text invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	@XmlElement(name = "MtdC")
	public BillingMethod4 getMethodC() {
		return methodC;
	}

	public void setMethodC(com.tools20022.repository.msg.BillingMethod4 methodC) {
		this.methodC = methodC;
	}

	@XmlElement(name = "SttlmAmt", required = true)
	public AmountAndDirection34 getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(com.tools20022.repository.msg.AmountAndDirection34 settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	@XmlElement(name = "TaxDueToRgn", required = true)
	public AmountAndDirection34 getTaxDueToRegion() {
		return taxDueToRegion;
	}

	public void setTaxDueToRegion(com.tools20022.repository.msg.AmountAndDirection34 taxDueToRegion) {
		this.taxDueToRegion = taxDueToRegion;
	}
}