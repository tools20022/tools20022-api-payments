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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max40Text;
import com.tools20022.repository.entity.Tax;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Tax region that levies a tax on the services in a statement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BillingTaxRegion1#RegionNumber
 * BillingTaxRegion1.RegionNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingTaxRegion1#RegionName
 * BillingTaxRegion1.RegionName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#CustomerTaxIdentification
 * BillingTaxRegion1.CustomerTaxIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingTaxRegion1#PointDate
 * BillingTaxRegion1.PointDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#SendingFinancialInstitution
 * BillingTaxRegion1.SendingFinancialInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#InvoiceNumber
 * BillingTaxRegion1.InvoiceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingTaxRegion1#MethodC
 * BillingTaxRegion1.MethodC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#SettlementAmount
 * BillingTaxRegion1.SettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#TaxDueToRegion
 * BillingTaxRegion1.TaxDueToRegion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
 * "BillingTaxRegion1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tax region that levies a tax on the services in a statement."</li>
 * </ul>
 */
public class BillingTaxRegion1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	public static final MMMessageAttribute RegionNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingTaxRegion1.mmObject();
			isDerived = false;
			xmlTag = "RgnNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegionNumber";
			definition = "Specifies a particular unique zone of taxes assigned by taxing authorities.  A tax region number is unique.  Every account is considered to reside within a tax region, although some tax regions may not charge taxes on services.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max40Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Tax#AdministrationZone
	 * Tax.AdministrationZone}</li>
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
	public static final MMMessageAttribute RegionName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingTaxRegion1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.AdministrationZone;
			isDerived = false;
			xmlTag = "RgnNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegionName";
			definition = "Name associated with a specific tax region number.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max40Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#TaxIdentificationNumber
	 * PartyIdentificationInformation.TaxIdentificationNumber}</li>
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
	public static final MMMessageAttribute CustomerTaxIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingTaxRegion1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.TaxIdentificationNumber;
			isDerived = false;
			xmlTag = "CstmrTaxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerTaxIdentification";
			definition = "Specifies the financial institution’s customer tax identification number.  \n\nUsage:\nThis is the number passed from the financial institution to the taxing authority to indicate the specific customer tied to the taxes calculated for this tax region and group of delivered services.  It is typically the tax identification tied to a customer’s account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max40Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Tax#TaxDate Tax.TaxDate}</li>
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
	public static final MMMessageAttribute PointDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingTaxRegion1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.TaxDate;
			isDerived = false;
			xmlTag = "PtDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PointDate";
			definition = "Date on which the tax calculation was performed. \n\nUsage:\nThis date can be used to verify the tax rate value on the calculation date.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Tax#PartyRole Tax.PartyRole}
	 * </li>
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
	public static final MMMessageAssociationEnd SendingFinancialInstitution = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingTaxRegion1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.PartyRole;
			isDerived = false;
			xmlTag = "SndgFI";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendingFinancialInstitution";
			definition = "Tax information that relates to the sending financial institution.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BillingTaxIdentification1.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Identification
	 * GenericIdentification.Identification}</li>
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
	public static final MMMessageAttribute InvoiceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BillingTaxRegion1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			isDerived = false;
			xmlTag = "InvcNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceNumber";
			definition = "Unique number to be used by the customer to cross-reference between the tax region information and a tax invoice or notice.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max40Text.mmObject();
		}
	};
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
	public static final MMMessageAssociationEnd MethodC = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingTaxRegion1.mmObject();
			businessComponentTrace_lazy = () -> Tax.mmObject();
			isDerived = false;
			xmlTag = "MtdC";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MethodC";
			definition = "Tax values are based on tax calculation method C.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BillingMethod4.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Tax#Amount Tax.Amount}</li>
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
	public static final MMMessageAssociationEnd SettlementAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingTaxRegion1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.Amount;
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total tax amount expressed in the account’s settlement (or charging) currency.  \n\nUsage: This total sums the individual service level taxes as calculated for each service by methods A, B and D. The sum of these amounts across all tax regions for the statement is displayed as the tax total sum in the compensation section.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Tax#Amount Tax.Amount}</li>
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
	public static final MMMessageAssociationEnd TaxDueToRegion = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BillingTaxRegion1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.Amount;
			isDerived = false;
			xmlTag = "TaxDueToRgn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDueToRegion";
			definition = "Total amount of all taxes for a specific customer within the tax region expressed in the tax region’s host currency. \n\nUsage: It is the same value as total tax amount and is included for the specific use of tax calculation methods A , B and D.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountAndDirection34.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingTaxRegion1.RegionNumber, com.tools20022.repository.msg.BillingTaxRegion1.RegionName,
						com.tools20022.repository.msg.BillingTaxRegion1.CustomerTaxIdentification, com.tools20022.repository.msg.BillingTaxRegion1.PointDate, com.tools20022.repository.msg.BillingTaxRegion1.SendingFinancialInstitution,
						com.tools20022.repository.msg.BillingTaxRegion1.InvoiceNumber, com.tools20022.repository.msg.BillingTaxRegion1.MethodC, com.tools20022.repository.msg.BillingTaxRegion1.SettlementAmount,
						com.tools20022.repository.msg.BillingTaxRegion1.TaxDueToRegion);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BillingTaxRegion1";
				definition = "Tax region that levies a tax on the services in a statement.";
			}
		});
		return mmObject_lazy.get();
	}
}