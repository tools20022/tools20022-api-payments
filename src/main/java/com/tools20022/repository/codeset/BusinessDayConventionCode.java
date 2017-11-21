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
 * Indicates how a date is adjusted when it falls on a non-business day.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessDayConventionCode#mmFollowing
 * BusinessDayConventionCode.mmFollowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessDayConventionCode#mmModifiedFollowing
 * BusinessDayConventionCode.mmModifiedFollowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessDayConventionCode#mmPreceding
 * BusinessDayConventionCode.mmPreceding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessDayConventionCode#mmNearest
 * BusinessDayConventionCode.mmNearest}</li>
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
 * <li>"FWNG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessDayConventionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates how a date is adjusted when it falls on a non-business day."</li>
 * </ul>
 */
public class BusinessDayConventionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The date will be the first following day that is a business day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessDayConventionCode
	 * BusinessDayConventionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FWNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Following"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The date will be the first following day that is a business day."</li>
	 * </ul>
	 */
	public static final MMCode mmFollowing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Following";
			definition = "The date will be the first following day that is a business day.";
			owner_lazy = () -> BusinessDayConventionCode.mmObject();
			codeName = "FWNG";
		}
	};
	/**
	 * The date will be the first following day that is a business day unless
	 * that day falls in the next calendar month, in which case that date will
	 * be the first preceding day that is a business day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessDayConventionCode
	 * BusinessDayConventionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MODF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedFollowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The date will be the first following day that is a business day unless that day falls in the next calendar month, in which case that date will be the first preceding day that is a business day."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmModifiedFollowing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ModifiedFollowing";
			definition = "The date will be the first following day that is a business day unless that day falls in the next calendar month, in which case that date will be the first preceding day that is a business day.";
			owner_lazy = () -> BusinessDayConventionCode.mmObject();
			codeName = "MODF";
		}
	};
	/**
	 * The date will be the first preceding day that is a business day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessDayConventionCode
	 * BusinessDayConventionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Preceding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The date will be the first preceding day that is a business day."</li>
	 * </ul>
	 */
	public static final MMCode mmPreceding = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Preceding";
			definition = "The date will be the first preceding day that is a business day.";
			owner_lazy = () -> BusinessDayConventionCode.mmObject();
			codeName = "PREC";
		}
	};
	/**
	 * The date will be the first preceding day that is a business day unless
	 * that day falls on a day other than a sunday or a monday, and will be the
	 * first following day that is a business day, if the relevant date
	 * otherwise falls on a sunday or a monday.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessDayConventionCode
	 * BusinessDayConventionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nearest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The date will be the first preceding day that is a business day unless that day falls on a day other than a sunday or a monday, and will be the first following day that is a business day, if the relevant date otherwise falls on a sunday or a monday."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNearest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Nearest";
			definition = "The date will be the first preceding day that is a business day unless that day falls on a day other than a sunday or a monday, and will be the first following day that is a business day, if the relevant date otherwise falls on a sunday or a monday.";
			owner_lazy = () -> BusinessDayConventionCode.mmObject();
			codeName = "NEAR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("FWNG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BusinessDayConventionCode";
				definition = "Indicates how a date is adjusted when it falls on a non-business day.";
				code_lazy = () -> Arrays.asList(BusinessDayConventionCode.mmFollowing, BusinessDayConventionCode.mmModifiedFollowing, BusinessDayConventionCode.mmPreceding, BusinessDayConventionCode.mmNearest);
			}
		});
		return mmObject_lazy.get();
	}
}