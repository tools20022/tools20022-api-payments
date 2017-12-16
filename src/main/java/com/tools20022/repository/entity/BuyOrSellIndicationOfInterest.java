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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.QualifierCode;
import com.tools20022.repository.codeset.QualityIndicationCode;
import com.tools20022.repository.codeset.RelativeSizeCode;
import com.tools20022.repository.codeset.RoutingTypeCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmNegotiationDetails
 * BuyOrSellIndicationOfInterest.mmNegotiationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmOrganisations
 * BuyOrSellIndicationOfInterest.mmOrganisations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmRelativeSize
 * BuyOrSellIndicationOfInterest.mmRelativeSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmPrice
 * BuyOrSellIndicationOfInterest.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmQualityIndication
 * BuyOrSellIndicationOfInterest.mmQualityIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmNaturalIndicator
 * BuyOrSellIndicationOfInterest.mmNaturalIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmQualifier
 * BuyOrSellIndicationOfInterest.mmQualifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmNumberOfLegs
 * BuyOrSellIndicationOfInterest.mmNumberOfLegs}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmSpreadToBenchmark
 * BuyOrSellIndicationOfInterest.mmSpreadToBenchmark}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmSwapSpread
 * BuyOrSellIndicationOfInterest.mmSwapSpread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmTwoLegTransaction
 * BuyOrSellIndicationOfInterest.mmTwoLegTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmRoutingType
 * BuyOrSellIndicationOfInterest.mmRoutingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BuyOrSellIndicationOfInterest#mmOrganisationListName
 * BuyOrSellIndicationOfInterest.mmOrganisationListName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Organisation#mmRelatedIndicationOfInterest
 * Organisation.mmRelatedIndicationOfInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRelatedIndicationOfInterest
 * SecuritiesFinancing.mmRelatedIndicationOfInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Spread#mmRelatedIndicationOfInterest
 * Spread.mmRelatedIndicationOfInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Spread#mmIndicationOfInterest
 * Spread.mmIndicationOfInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Negotiation#mmIndicationOfInterest
 * Negotiation.mmIndicationOfInterest}</li>
 * </ul>
 * </li>
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
 * "BuyOrSellIndicationOfInterest"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Intention to buy or sell a financial Instrument."</li>
 * </ul>
 */
public class BuyOrSellIndicationOfInterest {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Negotiation negotiationDetails;
	/**
	 * Negotiation details associated with an indication of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation#mmIndicationOfInterest
	 * Negotiation.mmIndicationOfInterest}</li>
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
	public static final MMBusinessAssociationEnd mmNegotiationDetails = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NegotiationDetails";
			definition = "Negotiation details associated with an indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.mmIndicationOfInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Organisation> organisations;
	/**
	 * Organisations to be included from the targeted list of firms, managed by
	 * the vendor, receiving indications.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmRelatedIndicationOfInterest
	 * Organisation.mmRelatedIndicationOfInterest}</li>
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
	public static final MMBusinessAssociationEnd mmOrganisations = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Organisations";
			definition = "Organisations to be included from the targeted list of firms, managed by the vendor, receiving indications.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Organisation.mmRelatedIndicationOfInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Organisation.mmObject();
		}
	};
	protected RelativeSizeCode relativeSize;
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
	public static final MMBusinessAttribute mmRelativeSize = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelativeSize";
			definition = "Indicates a quantity in relative size.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RelativeSizeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BuyOrSellIndicationOfInterest.class.getMethod("getRelativeSize", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesPricing price;
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
	public static final MMBusinessAttribute mmPrice = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Indicates the price of the instrument, applicable to the indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BuyOrSellIndicationOfInterest.class.getMethod("getPrice", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected QualityIndicationCode qualityIndication;
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
	public static final MMBusinessAttribute mmQualityIndication = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QualityIndication";
			definition = "Indicates the relative quality of the indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QualityIndicationCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BuyOrSellIndicationOfInterest.class.getMethod("getQualityIndication", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TrueFalseIndicator naturalIndicator;
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
	public static final MMBusinessAttribute mmNaturalIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NaturalIndicator";
			definition = "Indicates whether or not the indication of interest is the result of an existing agency order or a facilitation position resulting from an agency order, not from principal trading or order solicitation activity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BuyOrSellIndicationOfInterest.class.getMethod("getNaturalIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected QualifierCode qualifier;
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
	public static final MMBusinessAttribute mmQualifier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Qualifier";
			definition = "Qualifies the use of the indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QualifierCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BuyOrSellIndicationOfInterest.class.getMethod("getQualifier", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number numberOfLegs;
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
	public static final MMBusinessAttribute mmNumberOfLegs = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NumberOfLegs";
			definition = "In case of multilegs indication of interest, indicates number of instrumentLeg repeating group .";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BuyOrSellIndicationOfInterest.class.getMethod("getNumberOfLegs", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Spread spreadToBenchmark;
	/**
	 * Indicates the spread to benchmark details of an indication of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmRelatedIndicationOfInterest
	 * Spread.mmRelatedIndicationOfInterest}</li>
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
	public static final MMBusinessAssociationEnd mmSpreadToBenchmark = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpreadToBenchmark";
			definition = "Indicates the spread to benchmark details of an indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.mmRelatedIndicationOfInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};
	protected Spread swapSpread;
	/**
	 * Indicates the swap spread details of an indication of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmIndicationOfInterest
	 * Spread.mmIndicationOfInterest}</li>
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
	public static final MMBusinessAssociationEnd mmSwapSpread = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SwapSpread";
			definition = "Indicates the swap spread details of an indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.mmIndicationOfInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesFinancing> twoLegTransaction;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRelatedIndicationOfInterest
	 * SecuritiesFinancing.mmRelatedIndicationOfInterest}</li>
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
	public static final MMBusinessAssociationEnd mmTwoLegTransaction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TwoLegTransaction";
			definition = "Securities Financing is the process of lending or borrowing cash or securities against securities or cash collateral. It aims at optimising liquidity, support a trading strategy, or increase settlement efficiency.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmRelatedIndicationOfInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
		}
	};
	protected RoutingTypeCode routingType;
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
	public static final MMBusinessAttribute mmRoutingType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoutingType";
			definition = "Indicates if the type of routing is allowed or blocked.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RoutingTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BuyOrSellIndicationOfInterest.class.getMethod("getRoutingType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text organisationListName;
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
	public static final MMBusinessAttribute mmOrganisationListName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrganisationListName";
			definition = "Name of the organisation list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BuyOrSellIndicationOfInterest.class.getMethod("getOrganisationListName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BuyOrSellIndicationOfInterest";
				definition = "Intention to buy or sell a financial Instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Organisation.mmRelatedIndicationOfInterest, com.tools20022.repository.entity.SecuritiesFinancing.mmRelatedIndicationOfInterest,
						com.tools20022.repository.entity.Spread.mmRelatedIndicationOfInterest, com.tools20022.repository.entity.Spread.mmIndicationOfInterest, com.tools20022.repository.entity.Negotiation.mmIndicationOfInterest);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmNegotiationDetails, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmOrganisations,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmRelativeSize, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmPrice,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmQualityIndication, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmNaturalIndicator,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmQualifier, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmNumberOfLegs,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmSpreadToBenchmark, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmSwapSpread,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmTwoLegTransaction, com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmRoutingType,
						com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmOrganisationListName);
			}

			@Override
			public Class<?> getInstanceClass() {
				return BuyOrSellIndicationOfInterest.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Negotiation getNegotiationDetails() {
		return negotiationDetails;
	}

	public void setNegotiationDetails(com.tools20022.repository.entity.Negotiation negotiationDetails) {
		this.negotiationDetails = negotiationDetails;
	}

	public List<Organisation> getOrganisations() {
		return organisations;
	}

	public void setOrganisations(List<com.tools20022.repository.entity.Organisation> organisations) {
		this.organisations = organisations;
	}

	public RelativeSizeCode getRelativeSize() {
		return relativeSize;
	}

	public void setRelativeSize(RelativeSizeCode relativeSize) {
		this.relativeSize = relativeSize;
	}

	public SecuritiesPricing getPrice() {
		return price;
	}

	public void setPrice(com.tools20022.repository.entity.SecuritiesPricing price) {
		this.price = price;
	}

	public QualityIndicationCode getQualityIndication() {
		return qualityIndication;
	}

	public void setQualityIndication(QualityIndicationCode qualityIndication) {
		this.qualityIndication = qualityIndication;
	}

	public TrueFalseIndicator getNaturalIndicator() {
		return naturalIndicator;
	}

	public void setNaturalIndicator(TrueFalseIndicator naturalIndicator) {
		this.naturalIndicator = naturalIndicator;
	}

	public QualifierCode getQualifier() {
		return qualifier;
	}

	public void setQualifier(QualifierCode qualifier) {
		this.qualifier = qualifier;
	}

	public Number getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(Number numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public Spread getSpreadToBenchmark() {
		return spreadToBenchmark;
	}

	public void setSpreadToBenchmark(com.tools20022.repository.entity.Spread spreadToBenchmark) {
		this.spreadToBenchmark = spreadToBenchmark;
	}

	public Spread getSwapSpread() {
		return swapSpread;
	}

	public void setSwapSpread(com.tools20022.repository.entity.Spread swapSpread) {
		this.swapSpread = swapSpread;
	}

	public List<SecuritiesFinancing> getTwoLegTransaction() {
		return twoLegTransaction;
	}

	public void setTwoLegTransaction(List<com.tools20022.repository.entity.SecuritiesFinancing> twoLegTransaction) {
		this.twoLegTransaction = twoLegTransaction;
	}

	public RoutingTypeCode getRoutingType() {
		return routingType;
	}

	public void setRoutingType(RoutingTypeCode routingType) {
		this.routingType = routingType;
	}

	public Max35Text getOrganisationListName() {
		return organisationListName;
	}

	public void setOrganisationListName(Max35Text organisationListName) {
		this.organisationListName = organisationListName;
	}
}