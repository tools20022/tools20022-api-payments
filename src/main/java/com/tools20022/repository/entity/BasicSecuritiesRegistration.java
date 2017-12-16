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
import com.tools20022.repository.codeset.RegistrationCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Information related to registration of securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BasicSecuritiesRegistration"
 * src="doc-files/BasicSecuritiesRegistration.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSecurity
 * BasicSecuritiesRegistration.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmRegistrationInstruction
 * BasicSecuritiesRegistration.mmRegistrationInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmCertificationIdentification
 * BasicSecuritiesRegistration.mmCertificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmCertificationDate
 * BasicSecuritiesRegistration.mmCertificationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSecuritiesCertificate
 * BasicSecuritiesRegistration.mmSecuritiesCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSplitPeriod
 * BasicSecuritiesRegistration.mmSplitPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmRegistration
 * Security.mmRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSecuritiesRegistration
 * DateTimePeriod.mmRelatedSecuritiesRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmBasicRegistration
 * SecuritiesCertificate.mmBasicRegistration}</li>
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
 * "BasicSecuritiesRegistration"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to registration of securities."</li>
 * </ul>
 */
public class BasicSecuritiesRegistration {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Security security;
	/**
	 * Security for which registration information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistration
	 * Security.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which registration information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which registration information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmRegistration;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected RegistrationCode registrationInstruction;
	/**
	 * Specifies whether registration should occur upon receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RegistrationCode
	 * RegistrationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether registration should occur upon receipt."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRegistrationInstruction = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegistrationInstruction";
			definition = "Specifies whether registration should occur upon receipt.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RegistrationCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BasicSecuritiesRegistration.class.getMethod("getRegistrationInstruction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text certificationIdentification;
	/**
	 * Identification assigned to a deposit.
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
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification assigned to a deposit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCertificationIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificationIdentification";
			definition = "Identification assigned to a deposit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BasicSecuritiesRegistration.class.getMethod("getCertificationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime certificationDate;
	/**
	 * Date/time at which the certificates in the deposit were validated by the
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the certificates in the deposit were validated by the agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCertificationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificationDate";
			definition = "Date/time at which the certificates in the deposit were validated by the agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BasicSecuritiesRegistration.class.getMethod("getCertificationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesCertificate> securitiesCertificate;
	/**
	 * Unique and unambiguous identification of a certificate assigned by the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmBasicRegistration
	 * SecuritiesCertificate.mmBasicRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a certificate assigned by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesCertificate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesCertificate";
			definition = "Unique and unambiguous identification of a certificate assigned by the issuer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.mmBasicRegistration;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.mmObject();
		}
	};
	protected DateTimePeriod splitPeriod;
	/**
	 * Period during which a physical certificate can be split.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSecuritiesRegistration
	 * DateTimePeriod.mmRelatedSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which a physical certificate can be split."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSplitPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SplitPeriod";
			definition = "Period during which a physical certificate can be split.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedSecuritiesRegistration;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BasicSecuritiesRegistration";
				definition = "Information related to registration of securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmRegistration, com.tools20022.repository.entity.DateTimePeriod.mmRelatedSecuritiesRegistration,
						com.tools20022.repository.entity.SecuritiesCertificate.mmBasicRegistration);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSecurity, com.tools20022.repository.entity.BasicSecuritiesRegistration.mmRegistrationInstruction,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.mmCertificationIdentification, com.tools20022.repository.entity.BasicSecuritiesRegistration.mmCertificationDate,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSecuritiesCertificate, com.tools20022.repository.entity.BasicSecuritiesRegistration.mmSplitPeriod);
			}

			@Override
			public Class<?> getInstanceClass() {
				return BasicSecuritiesRegistration.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(com.tools20022.repository.entity.Security security) {
		this.security = security;
	}

	public RegistrationCode getRegistrationInstruction() {
		return registrationInstruction;
	}

	public void setRegistrationInstruction(RegistrationCode registrationInstruction) {
		this.registrationInstruction = registrationInstruction;
	}

	public Max35Text getCertificationIdentification() {
		return certificationIdentification;
	}

	public void setCertificationIdentification(Max35Text certificationIdentification) {
		this.certificationIdentification = certificationIdentification;
	}

	public ISODateTime getCertificationDate() {
		return certificationDate;
	}

	public void setCertificationDate(ISODateTime certificationDate) {
		this.certificationDate = certificationDate;
	}

	public List<SecuritiesCertificate> getSecuritiesCertificate() {
		return securitiesCertificate;
	}

	public void setSecuritiesCertificate(List<com.tools20022.repository.entity.SecuritiesCertificate> securitiesCertificate) {
		this.securitiesCertificate = securitiesCertificate;
	}

	public DateTimePeriod getSplitPeriod() {
		return splitPeriod;
	}

	public void setSplitPeriod(com.tools20022.repository.entity.DateTimePeriod splitPeriod) {
		this.splitPeriod = splitPeriod;
	}
}