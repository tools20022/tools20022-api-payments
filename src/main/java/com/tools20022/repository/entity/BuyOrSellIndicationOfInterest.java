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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.QualifierCode;
import com.tools20022.repository.codeset.QualityIndicationCode;
import com.tools20022.repository.codeset.RelativeSizeCode;
import com.tools20022.repository.codeset.RoutingTypeCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Intention to buy or sell a financial Instrument.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BuyOrSellIndicationOfInterest"
 * src="doc-files/BuyOrSellIndicationOfInterest.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#NegotiationDetails
 * BuyOrSellIndicationOfInterest.NegotiationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#Organisations
 * BuyOrSellIndicationOfInterest.Organisations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#RelativeSize
 * BuyOrSellIndicationOfInterest.RelativeSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#Price
 * BuyOrSellIndicationOfInterest.Price}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#QualityIndication
 * BuyOrSellIndicationOfInterest.QualityIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#NaturalIndicator
 * BuyOrSellIndicationOfInterest.NaturalIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#Qualifier
 * BuyOrSellIndicationOfInterest.Qualifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#NumberOfLegs
 * BuyOrSellIndicationOfInterest.NumberOfLegs}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#SpreadToBenchmark
 * BuyOrSellIndicationOfInterest.SpreadToBenchmark}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#SwapSpread
 * BuyOrSellIndicationOfInterest.SwapSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#TwoLegTransaction
 * BuyOrSellIndicationOfInterest.TwoLegTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#RoutingType
 * BuyOrSellIndicationOfInterest.RoutingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#OrganisationListName
 * BuyOrSellIndicationOfInterest.OrganisationListName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#RelatedIndicationOfInterest
 * Organisation.RelatedIndicationOfInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#RelatedIndicationOfInterest
 * SecuritiesFinancing.RelatedIndicationOfInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Spread#RelatedIndicationOfInterest
 * Spread.RelatedIndicationOfInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#IndicationOfInterest
 * Spread.IndicationOfInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Negotiation#IndicationOfInterest
 * Negotiation.IndicationOfInterest}</li>
 * </ul>
 * </li>
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
 * "BuyOrSellIndicationOfInterest"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Intention to buy or sell a financial Instrument."</li>
 * </ul>
 */
public class BuyOrSellIndicationOfInterest {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Negotiation details associated with an indication of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation#IndicationOfInterest
	 * Negotiation.IndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Negotiation
	 * Negotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Negotiation details associated with an indication of interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NegotiationDetails = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NegotiationDetails";
			definition = "Negotiation details associated with an indication of interest.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Negotiation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.IndicationOfInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Organisations to be included from the targeted list of firms, managed by
	 * the vendor, receiving indications.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#RelatedIndicationOfInterest
	 * Organisation.RelatedIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Organisation
	 * Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Organisations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organisations to be included from the targeted list of firms, managed by the vendor, receiving indications."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Organisations = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Organisations";
			definition = "Organisations to be included from the targeted list of firms, managed by the vendor, receiving indications.";
			minOccurs = 1;
			type_lazy = () -> Organisation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.RelatedIndicationOfInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates a quantity in relative size.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RelativeSizeCode
	 * RelativeSizeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelativeSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates a quantity in relative size."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RelativeSize = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelativeSize";
			definition = "Indicates a quantity in relative size.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RelativeSizeCode.mmObject();
		}
	};
	/**
	 * Indicates the price of the instrument, applicable to the indication of
	 * interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the price of the instrument, applicable to the indication of interest."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Price = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Indicates the price of the instrument, applicable to the indication of interest.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> SecuritiesPricing.mmObject();
		}
	};
	/**
	 * Indicates the relative quality of the indication of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QualityIndicationCode
	 * QualityIndicationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QualityIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the relative quality of the indication of interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute QualityIndication = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QualityIndication";
			definition = "Indicates the relative quality of the indication of interest.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> QualityIndicationCode.mmObject();
		}
	};
	/**
	 * Indicates whether or not the indication of interest is the result of an
	 * existing agency order or a facilitation position resulting from an agency
	 * order, not from principal trading or order solicitation activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NaturalIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the indication of interest is the result of an existing agency order or a facilitation position resulting from an agency order, not from principal trading or order solicitation activity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NaturalIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NaturalIndicator";
			definition = "Indicates whether or not the indication of interest is the result of an existing agency order or a facilitation position resulting from an agency order, not from principal trading or order solicitation activity.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Qualifies the use of the indication of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QualifierCode
	 * QualifierCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Qualifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Qualifies the use of the indication of interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Qualifier = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Qualifier";
			definition = "Qualifies the use of the indication of interest.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> QualifierCode.mmObject();
		}
	};
	/**
	 * In case of multilegs indication of interest, indicates number of
	 * instrumentLeg repeating group .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfLegs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of multilegs indication of interest, indicates number of instrumentLeg repeating group ."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NumberOfLegs = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NumberOfLegs";
			definition = "In case of multilegs indication of interest, indicates number of instrumentLeg repeating group .";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates the spread to benchmark details of an indication of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#RelatedIndicationOfInterest
	 * Spread.RelatedIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadToBenchmark"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the spread to benchmark details of an indication of interest."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SpreadToBenchmark = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SpreadToBenchmark";
			definition = "Indicates the spread to benchmark details of an indication of interest.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Spread.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.RelatedIndicationOfInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the swap spread details of an indication of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#IndicationOfInterest
	 * Spread.IndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwapSpread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the swap spread details of an indication of interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SwapSpread = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwapSpread";
			definition = "Indicates the swap spread details of an indication of interest.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Spread.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.IndicationOfInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities Financing is the process of lending or borrowing cash or
	 * securities against securities or cash collateral. It aims at optimising
	 * liquidity, support a trading strategy, or increase settlement efficiency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#RelatedIndicationOfInterest
	 * SecuritiesFinancing.RelatedIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities Financing is the process of lending or borrowing cash or securities against securities or cash collateral. It aims at optimising liquidity, support a trading strategy, or increase settlement efficiency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TwoLegTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TwoLegTransaction";
			definition = "Securities Financing is the process of lending or borrowing cash or securities against securities or cash collateral. It aims at optimising liquidity, support a trading strategy, or increase settlement efficiency.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesFinancing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.RelatedIndicationOfInterest;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates if the type of routing is allowed or blocked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoutingTypeCode
	 * RoutingTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoutingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if the type of routing is allowed or blocked."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RoutingType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RoutingType";
			definition = "Indicates if the type of routing is allowed or blocked.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RoutingTypeCode.mmObject();
		}
	};
	/**
	 * Name of the organisation list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest
	 * BuyOrSellIndicationOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationListName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the organisation list."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrganisationListName = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BuyOrSellIndicationOfInterest.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrganisationListName";
			definition = "Name of the organisation list.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BuyOrSellIndicationOfInterest";
				definition = "Intention to buy or sell a financial Instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.RelatedIndicationOfInterest, com.tools20022.repository.entity.SecuritiesFinancing.RelatedIndicationOfInterest,
						com.tools20022.repository.entity.Spread.RelatedIndicationOfInterest, com.tools20022.repository.entity.Spread.IndicationOfInterest, com.tools20022.repository.entity.Negotiation.IndicationOfInterest);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.NegotiationDetails, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.Organisations,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.RelativeSize, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.Price,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.QualityIndication, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.NaturalIndicator,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.Qualifier, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.NumberOfLegs,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.SpreadToBenchmark, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.SwapSpread,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.TwoLegTransaction, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.RoutingType,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.OrganisationListName);
			}
		});
		return mmObject_lazy.get();
	}
}