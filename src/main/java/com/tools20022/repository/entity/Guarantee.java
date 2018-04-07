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
import com.tools20022.repository.codeset.GuarantyTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Partial or full coverage of amounts by a party other than the debtor.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Guarantee" src="doc-files/Guarantee.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmCoveredAmount
 * Guarantee.mmCoveredAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmEffectivePeriod
 * Guarantee.mmEffectivePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmGuaranteeType
 * Guarantee.mmGuaranteeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Guarantee#mmCoveredPercentage
 * Guarantee.mmCoveredPercentage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmDocument
 * Guarantee.mmDocument}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmGuaranteedTrade
 * Guarantee.mmGuaranteedTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee#mmExcessAmount
 * Guarantee.mmExcessAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Guarantee#mmGuaranteePartyRole
 * Guarantee.mmGuaranteePartyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmGuarantee
 * Trade.mmGuarantee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmGuarantee
 * DateTimePeriod.mmGuarantee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmGuarantee
 * Document.mmGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GuaranteePartyRole#mmGuarantee
 * GuaranteePartyRole.mmGuarantee}</li>
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
 * "Guarantee"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Partial or full coverage of amounts by a party other than the debtor."</li>
 * </ul>
 */
public class Guarantee extends Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount coveredAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Guarantee
	 * Guarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoveredAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount covered by the guarantee."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Guarantee, CurrencyAndAmount> mmCoveredAmount = new MMBusinessAttribute<Guarantee, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoveredAmount";
			definition = "Amount covered by the guarantee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Guarantee obj) {
			return obj.getCoveredAmount();
		}

		@Override
		public void setValue(Guarantee obj, CurrencyAndAmount value) {
			obj.setCoveredAmount(value);
		}
	};
	protected DateTimePeriod effectivePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmGuarantee
	 * DateTimePeriod.mmGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Guarantee
	 * Guarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectivePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the guarantee is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Guarantee, DateTimePeriod> mmEffectivePeriod = new MMBusinessAssociationEnd<Guarantee, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the guarantee is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmGuarantee;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(Guarantee obj) {
			return obj.getEffectivePeriod();
		}

		@Override
		public void setValue(Guarantee obj, DateTimePeriod value) {
			obj.setEffectivePeriod(value);
		}
	};
	protected GuarantyTypeCode guaranteeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.GuarantyTypeCode
	 * GuarantyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Guarantee
	 * Guarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of security granted by an organisation with the role as 'guarantor', for example, suretyship."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Guarantee, GuarantyTypeCode> mmGuaranteeType = new MMBusinessAttribute<Guarantee, GuarantyTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GuaranteeType";
			definition = "Specifies the type of security granted by an organisation with the role as 'guarantor', for example, suretyship.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GuarantyTypeCode.mmObject();
		}

		@Override
		public GuarantyTypeCode getValue(Guarantee obj) {
			return obj.getGuaranteeType();
		}

		@Override
		public void setValue(Guarantee obj, GuarantyTypeCode value) {
			obj.setGuaranteeType(value);
		}
	};
	protected PercentageRate coveredPercentage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Guarantee
	 * Guarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoveredPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount covered by the guarantee, expressed as a percentage."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Guarantee, PercentageRate> mmCoveredPercentage = new MMBusinessAttribute<Guarantee, PercentageRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoveredPercentage";
			definition = "Amount covered by the guarantee, expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Guarantee obj) {
			return obj.getCoveredPercentage();
		}

		@Override
		public void setValue(Guarantee obj, PercentageRate value) {
			obj.setCoveredPercentage(value);
		}
	};
	protected List<com.tools20022.repository.entity.Document> document;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmGuarantee
	 * Document.mmGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Guarantee
	 * Guarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Document"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Document which contains the description of the guarantee."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Guarantee, List<Document>> mmDocument = new MMBusinessAssociationEnd<Guarantee, List<Document>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Document";
			definition = "Document which contains the description of the guarantee.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.mmGuarantee;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}

		@Override
		public List<Document> getValue(Guarantee obj) {
			return obj.getDocument();
		}

		@Override
		public void setValue(Guarantee obj, List<Document> value) {
			obj.setDocument(value);
		}
	};
	protected Trade guaranteedTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmGuarantee
	 * Trade.mmGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Guarantee
	 * Guarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade which is partially or fully covered by a guarantee."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Guarantee, com.tools20022.repository.entity.Trade> mmGuaranteedTrade = new MMBusinessAssociationEnd<Guarantee, com.tools20022.repository.entity.Trade>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedTrade";
			definition = "Trade which is partially or fully covered by a guarantee.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmGuarantee;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Trade getValue(Guarantee obj) {
			return obj.getGuaranteedTrade();
		}

		@Override
		public void setValue(Guarantee obj, com.tools20022.repository.entity.Trade value) {
			obj.setGuaranteedTrade(value);
		}
	};
	protected CurrencyAndAmount excessAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Guarantee
	 * Guarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExcessAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount not covered by the guarantee."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Guarantee, CurrencyAndAmount> mmExcessAmount = new MMBusinessAttribute<Guarantee, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExcessAmount";
			definition = "Amount not covered by the guarantee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Guarantee obj) {
			return obj.getExcessAmount();
		}

		@Override
		public void setValue(Guarantee obj, CurrencyAndAmount value) {
			obj.setExcessAmount(value);
		}
	};
	protected GuaranteePartyRole guaranteePartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GuaranteePartyRole#mmGuarantee
	 * GuaranteePartyRole.mmGuarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.GuaranteePartyRole
	 * GuaranteePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Guarantee
	 * Guarantee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteePartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the roles played by a party in the context of guarantees."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Guarantee, com.tools20022.repository.entity.GuaranteePartyRole> mmGuaranteePartyRole = new MMBusinessAssociationEnd<Guarantee, com.tools20022.repository.entity.GuaranteePartyRole>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Guarantee.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteePartyRole";
			definition = "Specifies the roles played by a party in the context of guarantees.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GuaranteePartyRole.mmGuarantee;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GuaranteePartyRole.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.GuaranteePartyRole getValue(Guarantee obj) {
			return obj.getGuaranteePartyRole();
		}

		@Override
		public void setValue(Guarantee obj, com.tools20022.repository.entity.GuaranteePartyRole value) {
			obj.setGuaranteePartyRole(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Guarantee";
				definition = "Partial or full coverage of amounts by a party other than the debtor.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.mmGuarantee, DateTimePeriod.mmGuarantee, com.tools20022.repository.entity.Document.mmGuarantee,
						com.tools20022.repository.entity.GuaranteePartyRole.mmGuarantee);
				superType_lazy = () -> Asset.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Guarantee.mmCoveredAmount, com.tools20022.repository.entity.Guarantee.mmEffectivePeriod, com.tools20022.repository.entity.Guarantee.mmGuaranteeType,
						com.tools20022.repository.entity.Guarantee.mmCoveredPercentage, com.tools20022.repository.entity.Guarantee.mmDocument, com.tools20022.repository.entity.Guarantee.mmGuaranteedTrade,
						com.tools20022.repository.entity.Guarantee.mmExcessAmount, com.tools20022.repository.entity.Guarantee.mmGuaranteePartyRole);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Guarantee.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getCoveredAmount() {
		return coveredAmount;
	}

	public Guarantee setCoveredAmount(CurrencyAndAmount coveredAmount) {
		this.coveredAmount = Objects.requireNonNull(coveredAmount);
		return this;
	}

	public DateTimePeriod getEffectivePeriod() {
		return effectivePeriod;
	}

	public Guarantee setEffectivePeriod(DateTimePeriod effectivePeriod) {
		this.effectivePeriod = Objects.requireNonNull(effectivePeriod);
		return this;
	}

	public GuarantyTypeCode getGuaranteeType() {
		return guaranteeType;
	}

	public Guarantee setGuaranteeType(GuarantyTypeCode guaranteeType) {
		this.guaranteeType = Objects.requireNonNull(guaranteeType);
		return this;
	}

	public PercentageRate getCoveredPercentage() {
		return coveredPercentage;
	}

	public Guarantee setCoveredPercentage(PercentageRate coveredPercentage) {
		this.coveredPercentage = Objects.requireNonNull(coveredPercentage);
		return this;
	}

	public List<Document> getDocument() {
		return document == null ? document = new ArrayList<>() : document;
	}

	public Guarantee setDocument(List<com.tools20022.repository.entity.Document> document) {
		this.document = Objects.requireNonNull(document);
		return this;
	}

	public Trade getGuaranteedTrade() {
		return guaranteedTrade;
	}

	public Guarantee setGuaranteedTrade(com.tools20022.repository.entity.Trade guaranteedTrade) {
		this.guaranteedTrade = Objects.requireNonNull(guaranteedTrade);
		return this;
	}

	public CurrencyAndAmount getExcessAmount() {
		return excessAmount;
	}

	public Guarantee setExcessAmount(CurrencyAndAmount excessAmount) {
		this.excessAmount = Objects.requireNonNull(excessAmount);
		return this;
	}

	public GuaranteePartyRole getGuaranteePartyRole() {
		return guaranteePartyRole;
	}

	public Guarantee setGuaranteePartyRole(com.tools20022.repository.entity.GuaranteePartyRole guaranteePartyRole) {
		this.guaranteePartyRole = Objects.requireNonNull(guaranteePartyRole);
		return this;
	}
}