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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.QualifierCode;
import com.tools20022.repository.codeset.QualityIndicationCode;
import com.tools20022.repository.codeset.RelativeSizeCode;
import com.tools20022.repository.codeset.RoutingTypeCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = type=BusinessComment, BusinessComment=Intention to buy or
 * sell a Financial Instrument.</li>
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
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<BuyOrSellIndicationOfInterest, Negotiation> mmNegotiationDetails = new MMBusinessAssociationEnd<BuyOrSellIndicationOfInterest, Negotiation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NegotiationDetails";
			definition = "Negotiation details associated with an indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Negotiation.mmIndicationOfInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Negotiation.mmObject();
		}

		@Override
		public Negotiation getValue(BuyOrSellIndicationOfInterest obj) {
			return obj.getNegotiationDetails();
		}

		@Override
		public void setValue(BuyOrSellIndicationOfInterest obj, Negotiation value) {
			obj.setNegotiationDetails(value);
		}
	};
	protected List<Organisation> organisations;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<BuyOrSellIndicationOfInterest, List<Organisation>> mmOrganisations = new MMBusinessAssociationEnd<BuyOrSellIndicationOfInterest, List<Organisation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Organisations";
			definition = "Organisations to be included from the targeted list of firms, managed by the vendor, receiving indications.";
			minOccurs = 1;
			opposite_lazy = () -> Organisation.mmRelatedIndicationOfInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Organisation.mmObject();
		}

		@Override
		public List<Organisation> getValue(BuyOrSellIndicationOfInterest obj) {
			return obj.getOrganisations();
		}

		@Override
		public void setValue(BuyOrSellIndicationOfInterest obj, List<Organisation> value) {
			obj.setOrganisations(value);
		}
	};
	protected RelativeSizeCode relativeSize;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 27</li>
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
	public static final MMBusinessAttribute<BuyOrSellIndicationOfInterest, RelativeSizeCode> mmRelativeSize = new MMBusinessAttribute<BuyOrSellIndicationOfInterest, RelativeSizeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "27"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelativeSize";
			definition = "Indicates a quantity in relative size.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RelativeSizeCode.mmObject();
		}

		@Override
		public RelativeSizeCode getValue(BuyOrSellIndicationOfInterest obj) {
			return obj.getRelativeSize();
		}

		@Override
		public void setValue(BuyOrSellIndicationOfInterest obj, RelativeSizeCode value) {
			obj.setRelativeSize(value);
		}
	};
	protected SecuritiesPricing price;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 423 44 and 15</li>
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
	public static final MMBusinessAttribute<BuyOrSellIndicationOfInterest, SecuritiesPricing> mmPrice = new MMBusinessAttribute<BuyOrSellIndicationOfInterest, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "423 44 and 15"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Indicates the price of the instrument, applicable to the indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(BuyOrSellIndicationOfInterest obj) {
			return obj.getPrice();
		}

		@Override
		public void setValue(BuyOrSellIndicationOfInterest obj, SecuritiesPricing value) {
			obj.setPrice(value);
		}
	};
	protected QualityIndicationCode qualityIndication;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 25</li>
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
	public static final MMBusinessAttribute<BuyOrSellIndicationOfInterest, QualityIndicationCode> mmQualityIndication = new MMBusinessAttribute<BuyOrSellIndicationOfInterest, QualityIndicationCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "25"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QualityIndication";
			definition = "Indicates the relative quality of the indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QualityIndicationCode.mmObject();
		}

		@Override
		public QualityIndicationCode getValue(BuyOrSellIndicationOfInterest obj) {
			return obj.getQualityIndication();
		}

		@Override
		public void setValue(BuyOrSellIndicationOfInterest obj, QualityIndicationCode value) {
			obj.setQualityIndication(value);
		}
	};
	protected TrueFalseIndicator naturalIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 130</li>
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
	public static final MMBusinessAttribute<BuyOrSellIndicationOfInterest, TrueFalseIndicator> mmNaturalIndicator = new MMBusinessAttribute<BuyOrSellIndicationOfInterest, TrueFalseIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "130"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NaturalIndicator";
			definition = "Indicates whether or not the indication of interest is the result of an existing agency order or a facilitation position resulting from an agency order, not from principal trading or order solicitation activity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(BuyOrSellIndicationOfInterest obj) {
			return obj.getNaturalIndicator();
		}

		@Override
		public void setValue(BuyOrSellIndicationOfInterest obj, TrueFalseIndicator value) {
			obj.setNaturalIndicator(value);
		}
	};
	protected QualifierCode qualifier;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 104</li>
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
	public static final MMBusinessAttribute<BuyOrSellIndicationOfInterest, QualifierCode> mmQualifier = new MMBusinessAttribute<BuyOrSellIndicationOfInterest, QualifierCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "104"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Qualifier";
			definition = "Qualifies the use of the indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QualifierCode.mmObject();
		}

		@Override
		public QualifierCode getValue(BuyOrSellIndicationOfInterest obj) {
			return obj.getQualifier();
		}

		@Override
		public void setValue(BuyOrSellIndicationOfInterest obj, QualifierCode value) {
			obj.setQualifier(value);
		}
	};
	protected Number numberOfLegs;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<BuyOrSellIndicationOfInterest, Number> mmNumberOfLegs = new MMBusinessAttribute<BuyOrSellIndicationOfInterest, Number>() {
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

		@Override
		public Number getValue(BuyOrSellIndicationOfInterest obj) {
			return obj.getNumberOfLegs();
		}

		@Override
		public void setValue(BuyOrSellIndicationOfInterest obj, Number value) {
			obj.setNumberOfLegs(value);
		}
	};
	protected Spread spreadToBenchmark;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<BuyOrSellIndicationOfInterest, Spread> mmSpreadToBenchmark = new MMBusinessAssociationEnd<BuyOrSellIndicationOfInterest, Spread>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpreadToBenchmark";
			definition = "Indicates the spread to benchmark details of an indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Spread.mmRelatedIndicationOfInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Spread.mmObject();
		}

		@Override
		public Spread getValue(BuyOrSellIndicationOfInterest obj) {
			return obj.getSpreadToBenchmark();
		}

		@Override
		public void setValue(BuyOrSellIndicationOfInterest obj, Spread value) {
			obj.setSpreadToBenchmark(value);
		}
	};
	protected Spread swapSpread;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<BuyOrSellIndicationOfInterest, Spread> mmSwapSpread = new MMBusinessAssociationEnd<BuyOrSellIndicationOfInterest, Spread>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SwapSpread";
			definition = "Indicates the swap spread details of an indication of interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Spread.mmIndicationOfInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Spread.mmObject();
		}

		@Override
		public Spread getValue(BuyOrSellIndicationOfInterest obj) {
			return obj.getSwapSpread();
		}

		@Override
		public void setValue(BuyOrSellIndicationOfInterest obj, Spread value) {
			obj.setSwapSpread(value);
		}
	};
	protected List<SecuritiesFinancing> twoLegTransaction;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<BuyOrSellIndicationOfInterest, List<SecuritiesFinancing>> mmTwoLegTransaction = new MMBusinessAssociationEnd<BuyOrSellIndicationOfInterest, List<SecuritiesFinancing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BuyOrSellIndicationOfInterest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TwoLegTransaction";
			definition = "Securities Financing is the process of lending or borrowing cash or securities against securities or cash collateral. It aims at optimising liquidity, support a trading strategy, or increase settlement efficiency.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesFinancing.mmRelatedIndicationOfInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesFinancing.mmObject();
		}

		@Override
		public List<SecuritiesFinancing> getValue(BuyOrSellIndicationOfInterest obj) {
			return obj.getTwoLegTransaction();
		}

		@Override
		public void setValue(BuyOrSellIndicationOfInterest obj, List<SecuritiesFinancing> value) {
			obj.setTwoLegTransaction(value);
		}
	};
	protected RoutingTypeCode routingType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<BuyOrSellIndicationOfInterest, RoutingTypeCode> mmRoutingType = new MMBusinessAttribute<BuyOrSellIndicationOfInterest, RoutingTypeCode>() {
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

		@Override
		public RoutingTypeCode getValue(BuyOrSellIndicationOfInterest obj) {
			return obj.getRoutingType();
		}

		@Override
		public void setValue(BuyOrSellIndicationOfInterest obj, RoutingTypeCode value) {
			obj.setRoutingType(value);
		}
	};
	protected Max35Text organisationListName;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<BuyOrSellIndicationOfInterest, Max35Text> mmOrganisationListName = new MMBusinessAttribute<BuyOrSellIndicationOfInterest, Max35Text>() {
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

		@Override
		public Max35Text getValue(BuyOrSellIndicationOfInterest obj) {
			return obj.getOrganisationListName();
		}

		@Override
		public void setValue(BuyOrSellIndicationOfInterest obj, Max35Text value) {
			obj.setOrganisationListName(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "BusinessComment", new String[]{"BusinessComment", "Intention to buy or sell a Financial Instrument."}));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BuyOrSellIndicationOfInterest";
				definition = "Intention to buy or sell a financial Instrument.";
				associationDomain_lazy = () -> Arrays.asList(Organisation.mmRelatedIndicationOfInterest, SecuritiesFinancing.mmRelatedIndicationOfInterest, Spread.mmRelatedIndicationOfInterest, Spread.mmIndicationOfInterest,
						Negotiation.mmIndicationOfInterest);
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

	public BuyOrSellIndicationOfInterest setNegotiationDetails(Negotiation negotiationDetails) {
		this.negotiationDetails = Objects.requireNonNull(negotiationDetails);
		return this;
	}

	public List<Organisation> getOrganisations() {
		return organisations == null ? organisations = new ArrayList<>() : organisations;
	}

	public BuyOrSellIndicationOfInterest setOrganisations(List<Organisation> organisations) {
		this.organisations = Objects.requireNonNull(organisations);
		return this;
	}

	public RelativeSizeCode getRelativeSize() {
		return relativeSize;
	}

	public BuyOrSellIndicationOfInterest setRelativeSize(RelativeSizeCode relativeSize) {
		this.relativeSize = Objects.requireNonNull(relativeSize);
		return this;
	}

	public SecuritiesPricing getPrice() {
		return price;
	}

	public BuyOrSellIndicationOfInterest setPrice(SecuritiesPricing price) {
		this.price = Objects.requireNonNull(price);
		return this;
	}

	public QualityIndicationCode getQualityIndication() {
		return qualityIndication;
	}

	public BuyOrSellIndicationOfInterest setQualityIndication(QualityIndicationCode qualityIndication) {
		this.qualityIndication = Objects.requireNonNull(qualityIndication);
		return this;
	}

	public TrueFalseIndicator getNaturalIndicator() {
		return naturalIndicator;
	}

	public BuyOrSellIndicationOfInterest setNaturalIndicator(TrueFalseIndicator naturalIndicator) {
		this.naturalIndicator = Objects.requireNonNull(naturalIndicator);
		return this;
	}

	public QualifierCode getQualifier() {
		return qualifier;
	}

	public BuyOrSellIndicationOfInterest setQualifier(QualifierCode qualifier) {
		this.qualifier = Objects.requireNonNull(qualifier);
		return this;
	}

	public Number getNumberOfLegs() {
		return numberOfLegs;
	}

	public BuyOrSellIndicationOfInterest setNumberOfLegs(Number numberOfLegs) {
		this.numberOfLegs = Objects.requireNonNull(numberOfLegs);
		return this;
	}

	public Spread getSpreadToBenchmark() {
		return spreadToBenchmark;
	}

	public BuyOrSellIndicationOfInterest setSpreadToBenchmark(Spread spreadToBenchmark) {
		this.spreadToBenchmark = Objects.requireNonNull(spreadToBenchmark);
		return this;
	}

	public Spread getSwapSpread() {
		return swapSpread;
	}

	public BuyOrSellIndicationOfInterest setSwapSpread(Spread swapSpread) {
		this.swapSpread = Objects.requireNonNull(swapSpread);
		return this;
	}

	public List<SecuritiesFinancing> getTwoLegTransaction() {
		return twoLegTransaction == null ? twoLegTransaction = new ArrayList<>() : twoLegTransaction;
	}

	public BuyOrSellIndicationOfInterest setTwoLegTransaction(List<SecuritiesFinancing> twoLegTransaction) {
		this.twoLegTransaction = Objects.requireNonNull(twoLegTransaction);
		return this;
	}

	public RoutingTypeCode getRoutingType() {
		return routingType;
	}

	public BuyOrSellIndicationOfInterest setRoutingType(RoutingTypeCode routingType) {
		this.routingType = Objects.requireNonNull(routingType);
		return this;
	}

	public Max35Text getOrganisationListName() {
		return organisationListName;
	}

	public BuyOrSellIndicationOfInterest setOrganisationListName(Max35Text organisationListName) {
		this.organisationListName = Objects.requireNonNull(organisationListName);
		return this;
	}
}