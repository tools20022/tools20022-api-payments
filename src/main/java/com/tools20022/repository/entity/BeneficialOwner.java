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
import com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode;
import com.tools20022.repository.codeset.CertificationFormatTypeCode;
import com.tools20022.repository.codeset.ERISAEligibilityCode;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Characteristics of an individual or entity that is ultimately entitled to the
 * benefit of income and rights in a security, as opposed to a nominal or legal
 * owner.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BeneficialOwner" src="doc-files/BeneficialOwner.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#CertificationType
 * BeneficialOwner.CertificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#NonDomicileCountry
 * BeneficialOwner.NonDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#CertificationIndicator
 * BeneficialOwner.CertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#CertificationFormat
 * BeneficialOwner.CertificationFormat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#ERISAEligibility
 * BeneficialOwner.ERISAEligibility}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BeneficialOwner#ERISARate
 * BeneficialOwner.ERISARate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#BenefitPlanDeclarationIndicator
 * BeneficialOwner.BenefitPlanDeclarationIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#CountryForBeneficialOwner
 * Country.CountryForBeneficialOwner}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
 * SecuritiesPartyRole}</li>
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
 * "BeneficialOwner"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Characteristics of an individual or entity that is ultimately entitled to the benefit of income and rights in a security, as opposed to a nominal or legal owner."
 * </li>
 * </ul>
 */
public class BeneficialOwner extends SecuritiesPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of certification which is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode
	 * BeneficiaryCertificationTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of certification which is required."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CertificationType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationType";
			definition = "Type of certification which is required.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
		}
	};
	/**
	 * The holder of the security has to certify, in line with the terms of the
	 * corporate action, that it is not domiciled in the country indicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#CountryForBeneficialOwner
	 * Country.CountryForBeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDomicileCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NonDomicileCountry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NonDomicileCountry";
			definition = "The holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.CountryForBeneficialOwner;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether or not certification is required from the account
	 * owner, for instance a certification is required to participate to a
	 * corporate action event.<br>
	 * Y: certification required <br>
	 * N: no certification required
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not certification is required from the account owner, for instance a certification is required to participate to a corporate action event.\r\nY: certification required \r\nN: no certification required"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CertificationIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationIndicator";
			definition = "Indicates whether or not certification is required from the account owner, for instance a certification is required to participate to a corporate action event.\r\nY: certification required \r\nN: no certification required";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the certification format required, that is, physical or
	 * electronic format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CertificationFormatTypeCode
	 * CertificationFormatTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationFormat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the certification format required, that is, physical or electronic format."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CertificationFormat = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationFormat";
			definition = "Specifies the certification format required, that is, physical or electronic format.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CertificationFormatTypeCode.mmObject();
		}
	};
	/**
	 * Eligibility to federal Employee Retirement Income Security Act.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ERISAEligibilityCode
	 * ERISAEligibilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISAEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Eligibility to federal Employee Retirement Income Security Act."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ERISAEligibility = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ERISAEligibility";
			definition = "Eligibility to federal Employee Retirement Income Security Act.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ERISAEligibilityCode.mmObject();
		}
	};
	/**
	 * Federal Employee Retirement Income Security Act (ERISA) rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISARate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Federal Employee Retirement Income Security Act (ERISA) rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ERISARate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ERISARate";
			definition = "Federal Employee Retirement Income Security Act (ERISA) rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Indicates whether the investor is a benefit plan investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenefitPlanDeclarationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor is a benefit plan investor."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BenefitPlanDeclarationIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> BeneficialOwner.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BenefitPlanDeclarationIndicator";
			definition = "Indicates whether the investor is a benefit plan investor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BeneficialOwner";
				definition = "Characteristics of an individual or entity that is ultimately entitled to the benefit of income and rights in a security, as opposed to a nominal or legal owner.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.CountryForBeneficialOwner);
				superType_lazy = () -> SecuritiesPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BeneficialOwner.CertificationType, com.tools20022.repository.entity.BeneficialOwner.NonDomicileCountry,
						com.tools20022.repository.entity.BeneficialOwner.CertificationIndicator, com.tools20022.repository.entity.BeneficialOwner.CertificationFormat, com.tools20022.repository.entity.BeneficialOwner.ERISAEligibility,
						com.tools20022.repository.entity.BeneficialOwner.ERISARate, com.tools20022.repository.entity.BeneficialOwner.BenefitPlanDeclarationIndicator);
			}
		});
		return mmObject_lazy.get();
	}
}