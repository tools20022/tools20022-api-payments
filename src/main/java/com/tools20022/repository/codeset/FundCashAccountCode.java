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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the cash account type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#mmCashAccount
 * FundCashAccountCode.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#mmPensionFundOrdinary
 * FundCashAccountCode.mmPensionFundOrdinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#mmPensionFundSpecial
 * FundCashAccountCode.mmPensionFundSpecial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#mmRetirementScheme
 * FundCashAccountCode.mmRetirementScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#mmOther
 * FundCashAccountCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#mmHedgeFund
 * FundCashAccountCode.mmHedgeFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#mmWorkplacePensionSchema
 * FundCashAccountCode.mmWorkplacePensionSchema}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#mmPrivatePensionScheme
 * FundCashAccountCode.mmPrivatePensionScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#mmCSDParticipantAccount
 * FundCashAccountCode.mmCSDParticipantAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#mmCSDMirrorAccount
 * FundCashAccountCode.mmCSDMirrorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#mmInterCSDAccount
 * FundCashAccountCode.mmInterCSDAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#mmTechnicalOffsetAccount
 * FundCashAccountCode.mmTechnicalOffsetAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode#mmCSDOmnibusAccount
 * FundCashAccountCode.mmCSDOmnibusAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundCashAccountCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the cash account type."</li>
 * </ul>
 */
public class FundCashAccountCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account."</li>
	 * </ul>
	 */
	public static final MMCode mmCashAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Central Provident Fund (CPF) ordinary account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionFundOrdinary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Central Provident Fund (CPF) ordinary account."</li>
	 * </ul>
	 */
	public static final MMCode mmPensionFundOrdinary = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PensionFundOrdinary";
			definition = "Central Provident Fund (CPF) ordinary account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "CPFO";
		}
	};
	/**
	 * Central Provident Fund (CPF) special account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPFS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionFundSpecial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Central Provident Fund (CPF) special account."</li>
	 * </ul>
	 */
	public static final MMCode mmPensionFundSpecial = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PensionFundSpecial";
			definition = "Central Provident Fund (CPF) special account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "CPFS";
		}
	};
	/**
	 * Supplementary Retirement Scheme (SRS) account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetirementScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Supplementary Retirement Scheme (SRS) account."</li>
	 * </ul>
	 */
	public static final MMCode mmRetirementScheme = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RetirementScheme";
			definition = "Supplementary Retirement Scheme (SRS) account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "SRSA";
		}
	};
	/**
	 * Another type cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Another type cash account."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Other";
			definition = "Another type cash account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Hedge fund account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HEDG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HedgeFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Hedge fund account."</li>
	 * </ul>
	 */
	public static final MMCode mmHedgeFund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HedgeFund";
			definition = "Hedge fund account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "HEDG";
		}
	};
	/**
	 * Workplace or company pension account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WorkplacePensionSchema"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Workplace or company pension account."</li>
	 * </ul>
	 */
	public static final MMCode mmWorkplacePensionSchema = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WorkplacePensionSchema";
			definition = "Workplace or company pension account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "CPEN";
		}
	};
	/**
	 * Private pension account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivatePensionScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Private pension account."</li>
	 * </ul>
	 */
	public static final MMCode mmPrivatePensionScheme = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivatePensionScheme";
			definition = "Private pension account.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "PPEN";
		}
	};
	/**
	 * Account owned by a CSD participant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDParticipantAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account owned by a CSD participant."</li>
	 * </ul>
	 */
	public static final MMCode mmCSDParticipantAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDParticipantAccount";
			definition = "Account owned by a CSD participant.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "CSDP";
		}
	};
	/**
	 * Account operated by a CSD for mirroring positions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDMirrorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account operated by a CSD for mirroring positions."</li>
	 * </ul>
	 */
	public static final MMCode mmCSDMirrorAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDMirrorAccount";
			definition = "Account operated by a CSD for mirroring positions.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "CSDM";
		}
	};
	/**
	 * Account operated by a CSD for settlement of securities legs for
	 * instructions involving internal CSDs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterCSDAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account operated by a CSD for settlement of securities legs for instructions involving internal CSDs."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInterCSDAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterCSDAccount";
			definition = "Account operated by a CSD for settlement of securities legs for instructions involving internal CSDs.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "ICSA";
		}
	};
	/**
	 * Account operated by a CSD in a direct holding market context
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOFF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalOffsetAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account operated by a CSD in a direct holding market context"</li>
	 * </ul>
	 */
	public static final MMCode mmTechnicalOffsetAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalOffsetAccount";
			definition = "Account operated by a CSD in a direct holding market context";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "TOFF";
		}
	};
	/**
	 * Account operated by a CSD in cross-CSD settlement context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccountCode
	 * FundCashAccountCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSDO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDOmnibusAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account operated by a CSD in cross-CSD settlement context."</li>
	 * </ul>
	 */
	public static final MMCode mmCSDOmnibusAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDOmnibusAccount";
			definition = "Account operated by a CSD in cross-CSD settlement context.";
			owner_lazy = () -> FundCashAccountCode.mmObject();
			codeName = "CSDO";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundCashAccountCode";
				definition = "Specifies the cash account type.";
				code_lazy = () -> Arrays.asList(FundCashAccountCode.mmCashAccount, FundCashAccountCode.mmPensionFundOrdinary, FundCashAccountCode.mmPensionFundSpecial, FundCashAccountCode.mmRetirementScheme, FundCashAccountCode.mmOther,
						FundCashAccountCode.mmHedgeFund, FundCashAccountCode.mmWorkplacePensionSchema, FundCashAccountCode.mmPrivatePensionScheme, FundCashAccountCode.mmCSDParticipantAccount, FundCashAccountCode.mmCSDMirrorAccount,
						FundCashAccountCode.mmInterCSDAccount, FundCashAccountCode.mmTechnicalOffsetAccount, FundCashAccountCode.mmCSDOmnibusAccount);
			}
		});
		return mmObject_lazy.get();
	}
}